package gov.us.fhim.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.term.core.profile.ContextToValueSet;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ObjectPluginAction;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.IntegerType;
import org.hl7.fhir.dstu3.model.Parameters;
import org.hl7.fhir.dstu3.model.ValueSet;
import org.hl7.fhir.dstu3.model.ValueSet.ValueSetExpansionContainsComponent;

import com.ibm.xtools.modeler.ui.UMLModeler;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import gov.us.fhim.ui.Activator;

public class ImportValueSets implements IObjectActionDelegate {

	private Shell shell;

	final String ActionTitle = "Import Valuesets";

	public ImportValueSets() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {

		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);

		ObjectPluginAction opa = (ObjectPluginAction) action;

		final IStructuredSelection selection = (IStructuredSelection) opa.getSelection();

		final TransactionalEditingDomain editingDomain = UMLModeler.getEditingDomain();

		final List elements = UMLModeler.getUMLUIHelper().getSelectedElements();

		Job j = new Job("Import Value Sets") {
			@Override
			public IStatus run(final IProgressMonitor monitor) {

				IStatus status = Status.OK_STATUS;
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain, "Import Value Set") {
					@Override
					protected void doExecute() {

						if (!elements.isEmpty() && elements.get(0) instanceof Package) {
							monitor.beginTask("Import Value Sets", 100);
							walkPackages((Package) elements.get(0), monitor);
						}
					}
				});

				if (monitor.isCanceled()) {
					status = Status.CANCEL_STATUS;
				}
				monitor.done();

				return status;
			}

		};
		j.schedule();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	// ResourceSet resourceSet = null;

	void walkPackages(Package thePackage, IProgressMonitor monitor) {

		if ("Enumerations".equals(thePackage.getName())) {
			return;
		}

		monitor.subTask(thePackage.getQualifiedName());
		for (Package aPackage : thePackage.getNestedPackages()) {
			System.out.println(aPackage.getQualifiedName());
			walkPackages(aPackage, monitor);
		}

		Package theEnumerationsPackage = thePackage.getNestedPackage("Enumerations");
		if (theEnumerationsPackage == null) {

			theEnumerationsPackage = thePackage.createNestedPackage("Enumerations");

		}

		ArrayList<Enumeration> enumerations = new ArrayList<Enumeration>();
		ArrayList<org.eclipse.uml2.uml.Class> classes = new ArrayList<org.eclipse.uml2.uml.Class>();
		ArrayList<String> context = new ArrayList<String>();

		for (Element element : thePackage.getOwnedElements()) {
			if (element instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class theClass = (org.eclipse.uml2.uml.Class) element;
				for (Property theProperty : theClass.getOwnedAttributes()) {
					System.out.println(theProperty.getQualifiedName());
					ValueSetConstraints valueSetConstraints = TermProfileUtil.getValueSetConstraints(theProperty);
					if (valueSetConstraints != null) {
						for (ContextToValueSet ctov : valueSetConstraints.getConstraints()) {
							Enumeration valueSetEnumeration = (Enumeration) theEnumerationsPackage.getOwnedMember(
								ctov.getValueSetName());
							if (valueSetEnumeration == null) {
								valueSetEnumeration = (Enumeration) theEnumerationsPackage.createOwnedType(
									ctov.getValueSetName(), UMLPackage.eINSTANCE.getEnumeration());

								System.out.println(ctov.getValueSetName());
								System.out.println(ctov.getValueSetOID());
								System.out.println(ctov.getValueSetURI());

							}

							if (valueSetEnumeration.getOwnedLiterals().isEmpty() && "FHIR".equals(ctov.getContext()) &&
									!StringUtils.isEmpty(ctov.getValueSetURI())) {
								populateEnumeration(valueSetEnumeration, ctov.getValueSetURI());
							}

							enumerations.add(valueSetEnumeration);
							classes.add(theClass);
							context.add(ctov.getContext());

						}

					}
				}
			}

		}

		for (int ctr = 0; ctr < enumerations.size(); ctr++) {
			Dependency dependency = classes.get(ctr).createDependency(enumerations.get(ctr));
			dependency.setName(context.get(ctr));
		}

		monitor.worked(1);
	}

	List<IGenericClient> fhirServers = new ArrayList<IGenericClient>();

	void populateEnumeration(Enumeration valueSetEnumeration, String url) {

		FhirContext ctx = FhirContext.forDstu3();

		// Populate the collection of fhir terms to use
		/**
		 * @TODO - need to add check to see if the support value sets
		 */
		if (fhirServers.isEmpty()) {
			for (String fhirURL : Activator.getDefault().getFHIRTermServers()) {
				IGenericClient client = ctx.newRestfulGenericClient(fhirURL);
				try {
					client.forceConformanceCheck();
					fhirServers.add(client);
				} catch (Exception e) {

				}
			}
		}
		for (IGenericClient client : fhirServers) {
			Bundle resultBundle = client.search().forResource(ValueSet.class).where(
				ValueSet.URL.matches().value(url)).returnBundle(Bundle.class).execute();

			if (resultBundle.getTotal() == 1) {
				String name = "";
				for (BundleEntryComponent s : resultBundle.getEntry()) {
					ValueSet vs = (ValueSet) s.getResource();
					name = vs.getIdElement().getIdPart();
				}

				Parameters inParams = new Parameters();
				inParams.addParameter().setName("count").setValue(new IntegerType(10));
				Parameters respParam = client.operation().onInstance(new IdDt("ValueSet", name)).named(
					"expand").withParameters(inParams).execute();
				ValueSet expanded = (ValueSet) respParam.getParameter().get(0).getResource();
				for (ValueSetExpansionContainsComponent r : expanded.getExpansion().getContains()) {
					EnumerationLiteral enumerationLiteral = valueSetEnumeration.createOwnedLiteral(
						r.getCode() + " (" + r.getDisplay() + ")");
					OpaqueExpression expression = (OpaqueExpression) enumerationLiteral.createSpecification(
						"name", null, UMLPackage.eINSTANCE.getOpaqueExpression());
					expression.getBodies().add(r.getDisplay());

				}
				if (!valueSetEnumeration.getOwnedLiterals().isEmpty()) {
					return;
				}
			}

		}

	}

	public static ValueSetConstraints getValueSetConstraints(Property property) {
		ValueSetConstraints valueSetConstraints = TermProfileUtil.getValueSetConstraints(property);
		if (valueSetConstraints == null) {
			// Stereotype stereotype = TermProfileUtil.getAppliedStereotype(
			// property, ITermProfileConstants.VALUE_SET_CONSTRAINTS);
			// UMLUtil.safeApplyStereotype(property, stereotype);
			TermProfileUtil.applyStereotype(property, ITermProfileConstants.VALUE_SET_CONSTRAINTS);
			valueSetConstraints = TermProfileUtil.getValueSetConstraints(property);
		}
		return valueSetConstraints;
	}

}

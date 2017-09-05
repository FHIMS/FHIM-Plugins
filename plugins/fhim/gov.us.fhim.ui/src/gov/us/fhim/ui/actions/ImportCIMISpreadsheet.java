/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *
 *******************************************************************************/
package gov.us.fhim.ui.actions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ObjectPluginAction;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class ImportCIMISpreadsheet implements IObjectActionDelegate {

	private static final String[] FILTER_NAMES = { "All Files (*.*)" };

	// These filter extensions are used to filter which files are displayed.
	private static final String[] FILTER_EXTS = { "*.*", "*.*" };

	private Shell shell;

	public ImportCIMISpreadsheet() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);

		ObjectPluginAction opa = (ObjectPluginAction) action;

		final IStructuredSelection selection = (IStructuredSelection) opa.getSelection();

		final String ActionTitle = "Import CIMI";

		final FileDialog fdlg = new FileDialog(shell, SWT.SINGLE);

		fdlg.setText("Select CIMI Source File");

		fdlg.setFilterNames(FILTER_NAMES);
		fdlg.setFilterExtensions(FILTER_EXTS);

		IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

				File f = (File) selection.getFirstElement();

				String umlPath = f.getLocation().toOSString(); // myWorkspaceRoot.getLocation().toOSString() + f.getFullPath().toOSString();

				try {
					importCIMI(monitor, umlPath, fdlg);
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					myWorkspaceRoot.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
				}

				if (monitor.isCanceled()) {
					monitor.done();
					return;
				}

				monitor.done();

			}

		};

		try {
			if (fdlg.open() != null) {
				progressDialog.run(false, true, runnableWithProgress);
				MetricsDialog dlg = new MetricsDialog(shell);
				dlg.create();
				dlg.open();
			}

		} catch (InvocationTargetException invocationTargetException) {
			MessageDialog.openError(
				shell, ActionTitle, "Error Processing Export " + invocationTargetException.getMessage());

		} catch (InterruptedException interruptedException) {
			MessageDialog.openError(shell, ActionTitle, "Error Processing Export " + interruptedException.getMessage());

		} finally {
			progressDialog.close();

		}
	}

	/**
	 * @param monitor
	 * @param umlPath
	 * @param fdlg
	 */
	protected void importCIMIa(IProgressMonitor monitor, String umlPath, FileDialog fdlg) {
		try {

			resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
			resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);
			resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

			URI umlModelURI = URI.createFileURI(umlPath);
			umlPackage = (Package) EcoreUtil.getObjectByType(
				resourceSet.getResource(umlModelURI, true).getContents(), UMLPackage.Literals.PACKAGE);

			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlPackage);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "CIMI") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					// String[] files = fdlg.getFileNames();

					monitor.beginTask("CIMI Mapping Import", 1000);

					monitor.subTask("Opening Model ");

					Package detailedClinicalModelsPackage = umlPackage.getNestedPackage("DetailedClinicalModels");

					Package generic = detailedClinicalModelsPackage.getNestedPackage("_generic_");

					org.eclipse.emf.ecore.util.EcoreUtil.Copier copier = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
					detailedClinicalModelsPackage.getNestedPackages().add((Package) copier.copy(generic));

					// Enumeration enumeration = UMLFactory.eINSTANCE.createEnumeration();
					//
					// String name = UMLUtil.getUniqueTypeName(
					// selectedPackage, Messages.AddCodeSystemVersion_default_name);
					// enumeration.setName(name);
					// selectedPackage.getOwnedTypes().add(enumeration);
					// TermProfileUtil.applyStereotype(enumeration, ITermProfileConstants.CODE_SYSTEM_VERSION);
					//
					// if (activePart instanceof ISetSelectionTarget) {
					// ((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(enumeration));
					// }

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				System.out.println(ee.getMessage());
				ee.printStackTrace();
				// Logger.logException(ee);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}

	}

	/**
	 * umlPackage is cache used to support dialog content after qvt
	 * transformation is completed
	 */
	Package umlPackage = null;

	Package codeSystemPackage = null;

	ResourceSet resourceSet = null;

	int importedItems;

	static String COMMENT = "This package contains the <EnglishName> Detailed Clinical Model (DCM). A DCM represents a single clinical concept, expressed as a Clinical Statement containing a Topic and a Context, such that the topic is bound to a single concept within in a Coding System (rather than a value set). DCMs are designed such that they could be used in multiple other models, and assembled to produce larger constructs.";

	String generateComment(String name) {
		return COMMENT.replace("<EnglishName>", name);
	}

	public void importCIMI(IProgressMonitor monitor, String umlPath, FileDialog fdlg) {

		// Load the uml model from the workspace
		resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

		URI umlModelURI = URI.createFileURI(umlPath);
		umlPackage = (Package) EcoreUtil.getObjectByType(
			resourceSet.getResource(umlModelURI, true).getContents(), UMLPackage.Literals.PACKAGE);

		String[] files = fdlg.getFileNames();

		monitor.beginTask("CIMI Mapping Import", 1000);

		// HashMap<Integer, StandardOrProject> columnmapping = new HashMap<Integer, StandardOrProject>();

		HashMap<String, Property> namedElements = new HashMap<String, Property>();

		monitor.subTask("Opening Model ");

		Package detailedClinicalModelsPackage = umlPackage.getNestedPackage("DetailedClinicalModels");

		// Package generic = detailedClinicalModelsPackage.getNestedPackage("_generic_");

		org.eclipse.uml2.uml.Class clinicalStatement = UMLUtil.getClassByName(umlPackage, "ClinicalStatement");

		org.eclipse.uml2.uml.Class evaluationResult = UMLUtil.getClassByName(umlPackage, "EvaluationResult");

		org.eclipse.uml2.uml.Class findingContext = UMLUtil.getClassByName(umlPackage, "FindingContext");

		// detailedClinicalModelsPackage.createNestedPackage("foo");
		// String dcmName = "BoneFreeArmMuscleArea";
		// String dt = "Quantity";
		// String rule = "self.kind.codeSystem.codeSystemName = 'LOINC' and self.kind.code = 'TBD' and self.result.unit.code = 'cm2' and
		// self.result.value.literal > 0.0";

		// String[] files = fdlg.getFileNames();
		for (int i = 0, n = files.length; i < n; i++) {

			BufferedReader br = null;

			monitor.subTask("Importing " + files[i]);

			try {
				br = new BufferedReader(
					new InputStreamReader(
						new FileInputStream(fdlg.getFilterPath() + System.getProperty("file.separator") + files[i]),
						"UTF-8"));

				String thisLine;

				// pop the header
				thisLine = br.readLine();

				while ((thisLine = br.readLine()) != null) {

					String[] results = thisLine.split(",");
					String dcmName = results[0];
					String dt = results[2];
					String rule = "";
					if (results.length >= 4) {
						rule = results[3];
					}

					if (StringUtils.isEmpty(dcmName) || StringUtils.isEmpty(dt)) {
						continue;
					}

					Package newDCM = detailedClinicalModelsPackage.createNestedPackage(dcmName);

					Comment c = newDCM.createOwnedComment();
					for (Stereotype s : c.getApplicableStereotypes()) {
						if (s.getName().equals("Documentation")) {
							c.applyStereotype(s);
							break;
						}

					}

					c.setBody(generateComment(dcmName));

					org.eclipse.uml2.uml.Class topic = newDCM.createOwnedClass(dcmName + "Topic", false);

					org.eclipse.uml2.uml.Class dataType = UMLUtil.getClassByName(umlPackage, dt);

					topic.createOwnedAttribute("result", dataType, 1, 1);

					topic.createGeneralization(evaluationResult);

					Constraint result = topic.createOwnedRule("ruleName");

					OpaqueExpression expression = (OpaqueExpression) result.createSpecification(
						null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
					expression.getLanguages().add("OCL");
					if (StringUtils.isEmpty(rule)) {
						expression.getBodies().add("true");
					} else {
						expression.getBodies().add(rule);
					}

					org.eclipse.uml2.uml.Class finding = newDCM.createOwnedClass(dcmName + "Finding", false);

					finding.createAssociation(
						true, AggregationKind.COMPOSITE_LITERAL, "context", 1, 1, findingContext, false,
						AggregationKind.NONE_LITERAL, "", 1, 1);

					finding.createAssociation(
						true, AggregationKind.NONE_LITERAL, "topic", 1, 1, topic, false, AggregationKind.NONE_LITERAL,
						"", 1, 1);

					finding.createGeneralization(clinicalStatement);

					monitor.worked(10);
				}
			} catch (Exception e) {

				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		// /*
		// * Name EnglishName DataType OCL
		// * BoneFreeArmMuscleArea BoneFreeArmMuscleArea Quantity self.kind.codeSystem.codeSystemName = 'LOINC' and self.kind.code = 'TBD' and
		// * self.result.unit.code = 'cm2' and self.result.value.literal > 0.0
		// */
		// org.eclipse.emf.ecore.util.EcoreUtil.Copier copier = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
		// Package newDCM = (Package) copier.copy(generic);
		// newDCM.setName(n);
		// Comment c = newDCM.createOwnedComment();
		// c.setBody(generateComment(n));
		//
		// for (Element e : newDCM.allOwnedElements()) {
		// if (e instanceof org.eclipse.uml2.uml.Class) {
		// ((org.eclipse.uml2.uml.Class) e).setName(n);
		// }
		//
		// }
		//
		// detailedClinicalModelsPackage.getNestedPackages().add(newDCM);

		// generic.co

		//

		// UMLUtil.getp
		// UMLUtil.getClassByName(detailedClinicalModelsPackage, umlPath);

		// for (Element e : umlPackage.allOwnedElements()) {
		// if (e instanceof NamedElement) {
		// monitor.worked(1);
		// NamedElement ne = (NamedElement) e;
		// if (!StringUtils.isEmpty(ne.getQualifiedName()) && ne instanceof Property) {
		// namedElements.put(ne.getQualifiedName(), (Property) ne);
		// // namedElements.put(ne.getQualifiedName().replace("(Abstract)", ""), ne);
		// System.out.println("Adding Property" + ne.getQualifiedName());
		// }
		//
		// }
		// }
		// didNotFind.clear();

		// for (int i = 0, n = files.length; i < n; i++) {
		//
		// BufferedReader br = null;
		//
		// monitor.subTask("Importing " + files[i]);
		//
		// try {
		// br = new BufferedReader(
		// new InputStreamReader(
		// new FileInputStream(fdlg.getFilterPath() + System.getProperty("file.separator") + files[i]),
		// "UTF-8"));
		//
		// String thisLine;
		//
		// // pop the header
		// thisLine = br.readLine();
		//
		// while ((thisLine = br.readLine()) != null) {
		// monitor.worked(10);
		//
		// String[] results = thisLine.split(",");
		// // String packageName = results[0];
		// // String className = results[1];
		// // String propertyName = results[2];
		// // String context = results[3];
		// // String valueSetName = results[3];
		// // String valueSetLocation = results[6];
		// // String key = "FHIM::" + packageName + "::" + className + "::" + propertyName;
		// //
		// // if (namedElements.containsKey(key)) {
		// // ValueSetConstraints vscs = getValueSetConstraints(namedElements.get(key));
		// // ContextToValueSet ctv = TermFactory.eINSTANCE.createContextToValueSet();
		// // ctv.setContext(context);
		// // ctv.setValueSetName(valueSetName);
		// // if (valueSetLocation.toUpperCase().startsWith("HTTP")) {
		// // ctv.setValueSetURI(valueSetLocation);
		// // } else {
		// // ctv.setValueSetOID(valueSetLocation);
		// // }
		// // vscs.getConstraints().add(ctv);
		// //
		// // } else {
		// // System.out.println("NOT FOUND " + key);
		// // }
		//
		// // if (results.length > 0 && results.length > fhimColumn &&
		// // !StringUtils.isEmpty(results[fhimColumn]) && !"?".equals(results[fhimColumn])) {
		// // theTarget = null;
		// //
		// // if (namedElements.containsKey(results[fhimColumn].replaceAll("\\.", "::"))) {
		// // // System.out.println("found " + results[fhimColumn].replaceAll("\\.", "::"));
		// //
		// // theTarget = namedElements.get(results[fhimColumn].replaceAll("\\.", "::"));
		// //
		// // Stereotype mapping = theTarget.getApplicableStereotype("fhim::Mapping");
		// //
		// // if (!theTarget.isStereotypeApplied(mapping)) {
		// // theTarget.applyStereotype(mapping);
		// // }
		// //
		// // Mapping mapping2 = (Mapping) theTarget.getStereotypeApplication(mapping);
		// //
		// // if (!columnmapping.isEmpty()) {
		// // for (Integer c : columnmapping.keySet()) {
		// // if (c < results.length) {
		// // String value = results[c];
		// // if (!StringUtils.isEmpty(value)) {
		// // Index index = FHIMFactory.eINSTANCE.createIndex();
		// // index.setStandardOrProject(columnmapping.get(c));
		// // index.setValue(value);
		// // mapping2.getIndex().add(index);
		// // }
		// // }
		// //
		// // }
		// // } else if (standardColumn != -1 && valueColumn != -1) {
		// // StandardOrProject sorp = StandardOrProject.getByName(
		// // results[standardColumn].replaceAll("\\W", ""));
		// //
		// // if (sorp != null && !StringUtils.isEmpty(results[valueColumn])) {
		// // Index index = FHIMFactory.eINSTANCE.createIndex();
		// // index.setStandardOrProject(sorp);
		// // index.setValue(results[valueColumn]);
		// // mapping2.getIndex().add(index);
		// // } else {
		// // System.out.println("No Standard or project found" + results[standardColumn]);
		// // didNotFind.put(lineCtr, results[fhimColumn].replaceAll("\\.", "::"));
		// // }
		// //
		// // }
		// //
		// // // standardColumn
		// //
		// // } else {
		// //
		// // didNotFind.put(lineCtr, results[fhimColumn].replaceAll("\\.", "::"));
		// //
		// // }
		// //
		// // }
		// } // end while
		//
		// } catch (Exception e) {
		//
		// e.printStackTrace();
		// } finally {
		// try {
		// br.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		//
		// }

		Map<String, String> options = new HashMap<String, String>();

		for (

		Resource resource : resourceSet.getResources()) {
			try {
				System.out.println("Saving " + resource.getURI().toString());
				resource.save(options);
			} catch (IOException e) {
				System.out.println("unable to save " + resource.getURI().toString());
				// e.printStackTrace();
			} catch (Exception e) {
				System.out.println("unable to save " + resource.getURI().toString());
				// e.printStackTrace();
			}
		}

	}

	public void selectionChanged(IAction action, ISelection selection) {

	}

	/**
	 * UMLModelMetricsDialog displays the results from the qvt transformation
	 * Give them something to look at insted of just an okay button
	 *
	 * @author seanmuir
	 *
	 */
	public class MetricsDialog extends TitleAreaDialog {

		public static final int OPEN = 9999;

		public static final int DELETE = 9998;

		org.eclipse.swt.widgets.Table table;

		public MetricsDialog(Shell shell) {
			super(shell);

		}

		@Override
		public void create() {
			super.create();
			setTitle("HL7 DSL to UML");
			if (umlPackage != null) {
				setMessage("UML Model Metrics for " + umlPackage.getName());
			}

		}

		@Override
		protected Control createDialogArea(Composite parent) {

			final Composite area = new Composite(parent, SWT.NULL);

			final GridLayout gridLayout = new GridLayout();
			gridLayout.marginWidth = 15;
			gridLayout.marginHeight = 10;
			area.setLayout(gridLayout);

			table = new org.eclipse.swt.widgets.Table(area, SWT.BORDER);

			final GridData gridData = new GridData();
			gridData.widthHint = 1500;
			table.setLayoutData(gridData);

			table.setHeaderVisible(true);
			final TableColumn column1 = new TableColumn(table, SWT.LEFT);

			final TableColumn column2 = new TableColumn(table, SWT.LEFT);

			column1.setText("Spreadsheet Row");
			column2.setText("FHIM Property");

			column1.setWidth(250);
			column2.setWidth(250);

			return area;
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

	}

}

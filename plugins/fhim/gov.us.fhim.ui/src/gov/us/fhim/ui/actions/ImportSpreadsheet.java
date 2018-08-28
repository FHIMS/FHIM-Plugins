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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.term.core.profile.ContextToValueSet;
import org.eclipse.mdht.uml.term.core.profile.TermFactory;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
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
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ObjectPluginAction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

public class ImportSpreadsheet implements IObjectActionDelegate {

	private static final String[] FILTER_NAMES = { "All Files (*.*)" };

	// These filter extensions are used to filter which files are displayed.
	private static final String[] FILTER_EXTS = { "*.*", "*.*" };

	private Shell shell;

	public ImportSpreadsheet() {
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

		final String ActionTitle = "Import Terminology";

		final FileDialog fdlg = new FileDialog(shell, SWT.SINGLE);

		fdlg.setText("Select Terminology Source File");

		fdlg.setFilterNames(FILTER_NAMES);
		fdlg.setFilterExtensions(FILTER_EXTS);

		IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

				File f = (File) selection.getFirstElement();

				String umlPath = f.getLocation().toOSString(); // myWorkspaceRoot.getLocation().toOSString() + f.getFullPath().toOSString();

				try {
					importMapping(monitor, umlPath, fdlg);
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
	 * umlPackage is cache used to support dialog content after qvt
	 * transformation is completed
	 */
	Package umlPackage = null;

	Package codeSystemPackage = null;

	ResourceSet resourceSet = null;

	int importedItems;

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

	HashMap<Integer, String> didNotFind = new HashMap<Integer, String>();

	public void importMapping(IProgressMonitor monitor, String umlPath, FileDialog fdlg) {

		// Load the uml model from the workspace
		resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

		URI umlModelURI = URI.createFileURI(umlPath);
		umlPackage = (Package) EcoreUtil.getObjectByType(
			resourceSet.getResource(umlModelURI, true).getContents(), UMLPackage.Literals.PACKAGE);

		String[] files = fdlg.getFileNames();

		monitor.beginTask("FHIM Mapping Import", 1000);

		// HashMap<Integer, StandardOrProject> columnmapping = new HashMap<Integer, StandardOrProject>();

		HashMap<String, Property> namedElements = new HashMap<String, Property>();

		monitor.subTask("Opening Model ");

		for (Element e : umlPackage.allOwnedElements()) {
			if (e instanceof NamedElement) {
				monitor.worked(1);
				NamedElement ne = (NamedElement) e;
				if (!StringUtils.isEmpty(ne.getQualifiedName()) && ne instanceof Property) {
					namedElements.put(ne.getQualifiedName(), (Property) ne);
					// namedElements.put(ne.getQualifiedName().replace("(Abstract)", ""), ne);
					// System.out.println("Adding Property" + ne.getQualifiedName());
				}

			}
		}
		didNotFind.clear();

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
					monitor.worked(10);

					String[] results = thisLine.split(",");

					if (results.length != 7) {
						continue;
					}
					String packageName = results[0];
					String className = results[1];
					String propertyName = results[2];
					String context = results[3] + " " + results[5];
					String valueSetName = results[4];
					String valueSetLocation = results[6];
					String key = "FHIM::" + packageName + "::" + className + "::" + propertyName;

					if (namedElements.containsKey(key)) {
						ValueSetConstraints vscs = getValueSetConstraints(namedElements.get(key));
						ContextToValueSet ctv = TermFactory.eINSTANCE.createContextToValueSet();
						ctv.setContext(context);
						ctv.setValueSetName(valueSetName);
						if (valueSetLocation.toUpperCase().startsWith("HTTP")) {
							ctv.setValueSetURI(valueSetLocation);
						} else {
							ctv.setValueSetOID(valueSetLocation);
						}
						vscs.getConstraints().add(ctv);

					} else {
						System.out.println("NOT FOUND " + key);
					}

					// if (results.length > 0 && results.length > fhimColumn &&
					// !StringUtils.isEmpty(results[fhimColumn]) && !"?".equals(results[fhimColumn])) {
					// theTarget = null;
					//
					// if (namedElements.containsKey(results[fhimColumn].replaceAll("\\.", "::"))) {
					// // System.out.println("found " + results[fhimColumn].replaceAll("\\.", "::"));
					//
					// theTarget = namedElements.get(results[fhimColumn].replaceAll("\\.", "::"));
					//
					// Stereotype mapping = theTarget.getApplicableStereotype("fhim::Mapping");
					//
					// if (!theTarget.isStereotypeApplied(mapping)) {
					// theTarget.applyStereotype(mapping);
					// }
					//
					// Mapping mapping2 = (Mapping) theTarget.getStereotypeApplication(mapping);
					//
					// if (!columnmapping.isEmpty()) {
					// for (Integer c : columnmapping.keySet()) {
					// if (c < results.length) {
					// String value = results[c];
					// if (!StringUtils.isEmpty(value)) {
					// Index index = FHIMFactory.eINSTANCE.createIndex();
					// index.setStandardOrProject(columnmapping.get(c));
					// index.setValue(value);
					// mapping2.getIndex().add(index);
					// }
					// }
					//
					// }
					// } else if (standardColumn != -1 && valueColumn != -1) {
					// StandardOrProject sorp = StandardOrProject.getByName(
					// results[standardColumn].replaceAll("\\W", ""));
					//
					// if (sorp != null && !StringUtils.isEmpty(results[valueColumn])) {
					// Index index = FHIMFactory.eINSTANCE.createIndex();
					// index.setStandardOrProject(sorp);
					// index.setValue(results[valueColumn]);
					// mapping2.getIndex().add(index);
					// } else {
					// System.out.println("No Standard or project found" + results[standardColumn]);
					// didNotFind.put(lineCtr, results[fhimColumn].replaceAll("\\.", "::"));
					// }
					//
					// }
					//
					// // standardColumn
					//
					// } else {
					//
					// didNotFind.put(lineCtr, results[fhimColumn].replaceAll("\\.", "::"));
					//
					// }
					//
					// }
				} // end while

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

			for (Integer k : didNotFind.keySet()) {
				System.out.println("MISSING" + didNotFind.get(k));
			}
		}

		Map<String, Object> options = new HashMap<String, Object>();

		options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);
		options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

		// for (Resource resource : resourceSet.getResources()) {
		//
		// System.out.println("resolveAll " + resource.getURI().toString());
		//
		// EcoreUtil.resolveAll(resource);
		// }

		for (Resource resource : resourceSet.getResources()) {
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

			if (!didNotFind.isEmpty()) {
				ArrayList<Integer> rows = new ArrayList<Integer>();
				rows.addAll(didNotFind.keySet());
				Collections.sort(rows);

				for (Integer s : rows) {
					final TableItem missing = new TableItem(table, SWT.NONE);
					missing.setText(new String[] { s.toString(), didNotFind.get(s) });
				}

				didNotFind.clear();
			}

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

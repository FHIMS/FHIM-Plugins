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

import gov.us.fhim.profile.FHIMFactory;
import gov.us.fhim.profile.FHIMPackage;
import gov.us.fhim.profile.Index;
import gov.us.fhim.profile.Mapping;
import gov.us.fhim.profile.StandardOrProject;

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
import org.eclipse.jface.viewers.TreeSelection;
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
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

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

		final TreeSelection selection = (TreeSelection) opa.getSelection();

		final String ActionTitle = "Import Terminology";

		final FileDialog fdlg = new FileDialog(shell, SWT.SINGLE);

		fdlg.setText("Select Terminology Source File");

		fdlg.setFilterNames(FILTER_NAMES);
		fdlg.setFilterExtensions(FILTER_EXTS);

		IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

				File f = (File) selection.getFirstElement();

				String umlPath = myWorkspaceRoot.getLocation().toOSString() + f.getFullPath().toOSString();

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

	public static Mapping getMapping(NamedElement theTarget) {

		FHIMPackage.eINSTANCE.getMapping();

		Mapping mapping = null;
		Stereotype stereotype = theTarget.getAppliedStereotype("fhim::Mapping");
		if (stereotype == null) {
			UMLUtil.safeApplyStereotype(theTarget, theTarget.getApplicableStereotype("fhim::Mapping"));
			stereotype = theTarget.getAppliedStereotype("fhim::Mapping");
		}
		if (stereotype != null) {
			mapping = (Mapping) theTarget.getStereotypeApplication(stereotype);
		}
		return mapping;
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

		HashMap<Integer, StandardOrProject> columnmapping = new HashMap<Integer, StandardOrProject>();

		HashMap<String, NamedElement> namedElements = new HashMap<String, NamedElement>();

		monitor.subTask("Opening Model ");

		for (Element e : umlPackage.allOwnedElements()) {
			if (e instanceof NamedElement) {
				monitor.worked(1);
				NamedElement ne = (NamedElement) e;
				if (!StringUtils.isEmpty(ne.getQualifiedName())) {
					namedElements.put(ne.getQualifiedName(), ne);
					namedElements.put(ne.getQualifiedName().replace("(Abstract)", ""), ne);
				}

			}
		}
		int fhimColumn = -1;
		didNotFind.clear();

		for (int i = 0, n = files.length; i < n; i++) {

			BufferedReader br = null;

			monitor.subTask("Importing " + files[i]);

			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(fdlg.getFilterPath() +
						System.getProperty("file.separator") + files[i]), "UTF-8"));

				String thisLine;

				thisLine = br.readLine();

				if (thisLine != null) {
					String[] columns = thisLine.split(",");
					int columnCtr = 0;
					for (String column : columns) {
						StandardOrProject sorp = StandardOrProject.getByName(column.replaceAll("\\W", ""));

						if (sorp != null) {
							columnmapping.put(columnCtr, sorp);
						} else if ("FHIM".equals(column)) {
							fhimColumn = columnCtr;
						} else {
							didNotFind.put(0, "Can not map following column " + column);
						}
						columnCtr++;
					}

				}

				if (fhimColumn != -1) {
					int lineCtr = 0;
					while ((thisLine = br.readLine()) != null) {
						monitor.worked(10);

						String[] results = thisLine.split(",");
						lineCtr++;
						NamedElement theTarget = null;

						if (results.length > 0 && results.length > fhimColumn &&
								!StringUtils.isEmpty(results[fhimColumn]) && !"?".equals(results[fhimColumn])) {
							theTarget = null;

							if (namedElements.containsKey(results[fhimColumn].replaceAll("\\.", "::"))) {
								// System.out.println("found " + results[fhimColumn].replaceAll("\\.", "::"));

								theTarget = namedElements.get(results[fhimColumn].replaceAll("\\.", "::"));

								Stereotype mapping = theTarget.getApplicableStereotype("fhim::Mapping");

								if (!theTarget.isStereotypeApplied(mapping)) {
									theTarget.applyStereotype(mapping);
								}

								Mapping mapping2 = (Mapping) theTarget.getStereotypeApplication(mapping);

								for (Integer c : columnmapping.keySet()) {
									if (c < results.length) {
										String value = results[c];
										if (!StringUtils.isEmpty(value)) {
											Index index = FHIMFactory.eINSTANCE.createIndex();
											index.setStandardOrProject(columnmapping.get(c));
											index.setValue(value);
											mapping2.getIndex().add(index);
										}
									}

								}

							} else {
								didNotFind.put(lineCtr, results[fhimColumn].replaceAll("\\.", "::"));
							}

						}
					} // end while
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

		Map<String, String> options = new HashMap<String, String>();

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

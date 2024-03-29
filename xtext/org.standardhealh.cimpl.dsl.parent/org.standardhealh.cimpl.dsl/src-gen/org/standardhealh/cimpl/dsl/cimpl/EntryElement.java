/**
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.cimpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getName <em>Name</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getConceptDescription <em>Concept Description</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getRedefinitions <em>Redefinitions</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getSubsets <em>Subsets</em>}</li>
 * </ul>
 *
 * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement()
 * @model
 * @generated
 */
public interface EntryElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Based On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Based On</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Based On</em>' attribute.
   * @see #setBasedOn(String)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement_BasedOn()
   * @model
   * @generated
   */
  String getBasedOn();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getBasedOn <em>Based On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Based On</em>' attribute.
   * @see #getBasedOn()
   * @generated
   */
  void setBasedOn(String value);

  /**
   * Returns the value of the '<em><b>Concept</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concept</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept</em>' attribute.
   * @see #setConcept(String)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement_Concept()
   * @model
   * @generated
   */
  String getConcept();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getConcept <em>Concept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept</em>' attribute.
   * @see #getConcept()
   * @generated
   */
  void setConcept(String value);

  /**
   * Returns the value of the '<em><b>Concept Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concept Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept Description</em>' attribute.
   * @see #setConceptDescription(String)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement_ConceptDescription()
   * @model
   * @generated
   */
  String getConceptDescription();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getConceptDescription <em>Concept Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept Description</em>' attribute.
   * @see #getConceptDescription()
   * @generated
   */
  void setConceptDescription(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.EntryElement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Redefinitions</b></em>' containment reference list.
   * The list contents are of type {@link org.standardhealh.cimpl.dsl.cimpl.Redefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Redefinitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Redefinitions</em>' containment reference list.
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement_Redefinitions()
   * @model containment="true"
   * @generated
   */
  EList<Redefinition> getRedefinitions();

  /**
   * Returns the value of the '<em><b>Subsets</b></em>' containment reference list.
   * The list contents are of type {@link org.standardhealh.cimpl.dsl.cimpl.Subsets}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsets</em>' containment reference list.
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getEntryElement_Subsets()
   * @model containment="true"
   * @generated
   */
  EList<Subsets> getSubsets();

} // EntryElement

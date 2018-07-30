/**
 * generated by Xtext 2.10.0
 */
package org.standardhealh.cimpl.dsl.cimpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference.
   * @see #setElements(Doc)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  Doc getElements();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.Model#getElements <em>Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elements</em>' containment reference.
   * @see #getElements()
   * @generated
   */
  void setElements(Doc value);

} // Model

/**
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.cimpl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.standardhealh.cimpl.dsl.cimpl.CimplPackage;
import org.standardhealh.cimpl.dsl.cimpl.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.impl.ElementImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.impl.ElementImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.impl.ElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.impl.ElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBasedOn() <em>Based On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasedOn()
   * @generated
   * @ordered
   */
  protected static final String BASED_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasedOn()
   * @generated
   * @ordered
   */
  protected String basedOn = BASED_ON_EDEFAULT;

  /**
   * The default value of the '{@link #getConcept() <em>Concept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcept()
   * @generated
   * @ordered
   */
  protected static final String CONCEPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConcept() <em>Concept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcept()
   * @generated
   * @ordered
   */
  protected String concept = CONCEPT_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CimplPackage.Literals.ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CimplPackage.ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBasedOn()
  {
    return basedOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasedOn(String newBasedOn)
  {
    String oldBasedOn = basedOn;
    basedOn = newBasedOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CimplPackage.ELEMENT__BASED_ON, oldBasedOn, basedOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConcept()
  {
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcept(String newConcept)
  {
    String oldConcept = concept;
    concept = newConcept;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CimplPackage.ELEMENT__CONCEPT, oldConcept, concept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CimplPackage.ELEMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CimplPackage.ELEMENT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CimplPackage.ELEMENT__NAME:
        return getName();
      case CimplPackage.ELEMENT__BASED_ON:
        return getBasedOn();
      case CimplPackage.ELEMENT__CONCEPT:
        return getConcept();
      case CimplPackage.ELEMENT__DESCRIPTION:
        return getDescription();
      case CimplPackage.ELEMENT__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CimplPackage.ELEMENT__NAME:
        setName((String)newValue);
        return;
      case CimplPackage.ELEMENT__BASED_ON:
        setBasedOn((String)newValue);
        return;
      case CimplPackage.ELEMENT__CONCEPT:
        setConcept((String)newValue);
        return;
      case CimplPackage.ELEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case CimplPackage.ELEMENT__VALUE:
        setValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CimplPackage.ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CimplPackage.ELEMENT__BASED_ON:
        setBasedOn(BASED_ON_EDEFAULT);
        return;
      case CimplPackage.ELEMENT__CONCEPT:
        setConcept(CONCEPT_EDEFAULT);
        return;
      case CimplPackage.ELEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case CimplPackage.ELEMENT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CimplPackage.ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CimplPackage.ELEMENT__BASED_ON:
        return BASED_ON_EDEFAULT == null ? basedOn != null : !BASED_ON_EDEFAULT.equals(basedOn);
      case CimplPackage.ELEMENT__CONCEPT:
        return CONCEPT_EDEFAULT == null ? concept != null : !CONCEPT_EDEFAULT.equals(concept);
      case CimplPackage.ELEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case CimplPackage.ELEMENT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", basedOn: ");
    result.append(basedOn);
    result.append(", concept: ");
    result.append(concept);
    result.append(", description: ");
    result.append(description);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //ElementImpl
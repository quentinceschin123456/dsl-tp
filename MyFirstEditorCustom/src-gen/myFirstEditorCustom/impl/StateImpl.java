/**
 */
package myFirstEditorCustom.impl;

import java.util.Collection;
import myFirstEditorCustom.MyFirstEditorCustomPackage;
import myFirstEditorCustom.State;
import myFirstEditorCustom.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myFirstEditorCustom.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link myFirstEditorCustom.impl.StateImpl#getOut <em>Out</em>}</li>
 *   <li>{@link myFirstEditorCustom.impl.StateImpl#getIn <em>In</em>}</li>
 *   <li>{@link myFirstEditorCustom.impl.StateImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> out;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> in;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyFirstEditorCustomPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyFirstEditorCustomPackage.STATE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOut() {
		if (out == null) {
			out = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					MyFirstEditorCustomPackage.STATE__OUT, MyFirstEditorCustomPackage.TRANSITION__TARGET);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIn() {
		if (in == null) {
			in = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					MyFirstEditorCustomPackage.STATE__IN, MyFirstEditorCustomPackage.TRANSITION__SOURCE);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyFirstEditorCustomPackage.STATE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MyFirstEditorCustomPackage.STATE__OUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOut()).basicAdd(otherEnd, msgs);
		case MyFirstEditorCustomPackage.STATE__IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MyFirstEditorCustomPackage.STATE__OUT:
			return ((InternalEList<?>) getOut()).basicRemove(otherEnd, msgs);
		case MyFirstEditorCustomPackage.STATE__IN:
			return ((InternalEList<?>) getIn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MyFirstEditorCustomPackage.STATE__NAME:
			return getName();
		case MyFirstEditorCustomPackage.STATE__OUT:
			return getOut();
		case MyFirstEditorCustomPackage.STATE__IN:
			return getIn();
		case MyFirstEditorCustomPackage.STATE__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MyFirstEditorCustomPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case MyFirstEditorCustomPackage.STATE__OUT:
			getOut().clear();
			getOut().addAll((Collection<? extends Transition>) newValue);
			return;
		case MyFirstEditorCustomPackage.STATE__IN:
			getIn().clear();
			getIn().addAll((Collection<? extends Transition>) newValue);
			return;
		case MyFirstEditorCustomPackage.STATE__TYPE:
			setType((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case MyFirstEditorCustomPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MyFirstEditorCustomPackage.STATE__OUT:
			getOut().clear();
			return;
		case MyFirstEditorCustomPackage.STATE__IN:
			getIn().clear();
			return;
		case MyFirstEditorCustomPackage.STATE__TYPE:
			setType(TYPE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MyFirstEditorCustomPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MyFirstEditorCustomPackage.STATE__OUT:
			return out != null && !out.isEmpty();
		case MyFirstEditorCustomPackage.STATE__IN:
			return in != null && !in.isEmpty();
		case MyFirstEditorCustomPackage.STATE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StateImpl

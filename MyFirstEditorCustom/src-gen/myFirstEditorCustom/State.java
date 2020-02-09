/**
 */
package myFirstEditorCustom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myFirstEditorCustom.State#getName <em>Name</em>}</li>
 *   <li>{@link myFirstEditorCustom.State#getOut <em>Out</em>}</li>
 *   <li>{@link myFirstEditorCustom.State#getIn <em>In</em>}</li>
 *   <li>{@link myFirstEditorCustom.State#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see myFirstEditorCustom.MyFirstEditorCustomPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see myFirstEditorCustom.MyFirstEditorCustomPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link myFirstEditorCustom.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link myFirstEditorCustom.Transition}.
	 * It is bidirectional and its opposite is '{@link myFirstEditorCustom.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see myFirstEditorCustom.MyFirstEditorCustomPackage#getState_Out()
	 * @see myFirstEditorCustom.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link myFirstEditorCustom.Transition}.
	 * It is bidirectional and its opposite is '{@link myFirstEditorCustom.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see myFirstEditorCustom.MyFirstEditorCustomPackage#getState_In()
	 * @see myFirstEditorCustom.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getIn();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see myFirstEditorCustom.MyFirstEditorCustomPackage#getState_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link myFirstEditorCustom.State#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // State

/**
 */
package myFirstEditorCustom.impl;

import myFirstEditorCustom.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyFirstEditorCustomFactoryImpl extends EFactoryImpl implements MyFirstEditorCustomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyFirstEditorCustomFactory init() {
		try {
			MyFirstEditorCustomFactory theMyFirstEditorCustomFactory = (MyFirstEditorCustomFactory) EPackage.Registry.INSTANCE
					.getEFactory(MyFirstEditorCustomPackage.eNS_URI);
			if (theMyFirstEditorCustomFactory != null) {
				return theMyFirstEditorCustomFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyFirstEditorCustomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyFirstEditorCustomFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MyFirstEditorCustomPackage.STATE_MACHINE:
			return createStateMachine();
		case MyFirstEditorCustomPackage.STATE:
			return createState();
		case MyFirstEditorCustomPackage.TRANSITION:
			return createTransition();
		case MyFirstEditorCustomPackage.START_STATE:
			return createStartState();
		case MyFirstEditorCustomPackage.END_STATE:
			return createEndState();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartState createStartState() {
		StartStateImpl startState = new StartStateImpl();
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndState createEndState() {
		EndStateImpl endState = new EndStateImpl();
		return endState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyFirstEditorCustomPackage getMyFirstEditorCustomPackage() {
		return (MyFirstEditorCustomPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyFirstEditorCustomPackage getPackage() {
		return MyFirstEditorCustomPackage.eINSTANCE;
	}

} //MyFirstEditorCustomFactoryImpl

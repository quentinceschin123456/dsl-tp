/*
 * generated by Xtext 2.14.0
 */
package ut2j.m1ice.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import ut2j.m1ice.StateMachine.ui.internal.StateMachineActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StateMachineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(StateMachineActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		StateMachineActivator activator = StateMachineActivator.getInstance();
		return activator != null ? activator.getInjector(StateMachineActivator.UT2J_M1ICE_STATEMACHINE) : null;
	}

}
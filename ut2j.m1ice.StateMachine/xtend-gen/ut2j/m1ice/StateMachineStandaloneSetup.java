/**
 * generated by Xtext 2.14.0
 */
package ut2j.m1ice;

import ut2j.m1ice.StateMachineStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class StateMachineStandaloneSetup extends StateMachineStandaloneSetupGenerated {
  public static void doSetup() {
    new StateMachineStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

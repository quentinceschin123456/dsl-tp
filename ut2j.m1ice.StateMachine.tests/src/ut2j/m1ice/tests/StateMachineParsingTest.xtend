/*
 * generated by Xtext 2.14.0
 */
package ut2j.m1ice.tests

import com.google.inject.Inject
import myFirstEditorCustom.StateMachine
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(StateMachineInjectorProvider)
class StateMachineParsingTest {
	@Inject
	ParseHelper<StateMachine> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)
	}
}

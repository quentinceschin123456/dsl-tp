package myFirstEditorCustom.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import myFirstEditorCustom.State
import myFirstEditorCustom.Transition
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI



import static extension myFirstEditorCustom.aspects.StateMachineAspect.*
import static extension myFirstEditorCustom.aspects.StateAspect.*
import static extension myFirstEditorCustom.aspects.TransitionAspect.*
import myFirstEditorCustom.MyFirstEditorCustomPackage
import myFirstEditorCustom.StateMachine

class Interpreter {
    def static void main(String[] args) {
        MyFirstEditorCustomPackage.eINSTANCE.class
        Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
        var Resource resource = new ResourceSetImpl().getResource(URI.createURI('C:\\Users\\AdminEtu\\Desktop\\LocalWorkspace\\EclipseDSLWorkspace\\MyFirstEditorCustom\\model\\StateMachine.xmi'), true)
        var myFSM = resource.contents.get(0) as StateMachine
        myFSM.execute();
    }
}

@Aspect(className=StateMachine)
class StateMachineAspect {
		StateMachine ma = new StateMachine("ma");
		State s1 = new State("s1",StateType.On);
		State s2 = new State("s2",StateType.On);
		Transition tr = new Transition("tr",s1,s2);
		
	def void execute(){
		_self.ma.state.add(s1);
		_self.ma.states.add(s2);
		_self.ma.transitions.add(tr);
		System.out.println(ma.toString());
		for (Transition trans : _self.ma.transitions) {
				_self.ma.currentState = trans.change(ma.currentState);
		}
		
		System.out.println(ma.toString());
	}
}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Transition)
class TransitionAspect {

}




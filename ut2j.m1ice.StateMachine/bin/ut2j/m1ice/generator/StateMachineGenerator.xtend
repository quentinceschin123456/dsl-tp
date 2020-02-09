/*
 * generated by Xtext 2.14.0
 */
package ut2j.m1ice.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import myFirstEditorCustom.*
import java.util.List
import myFirstEditorCustom.StateMachine
import javax.xml.stream.events.EndDocument

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StateMachineGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var myStateMachine = resource.contents.get(0) as StateMachine
		
		generateAllClass(myStateMachine,fsa)
	}
	
	def generateAllClass(StateMachine stateMachine,IFileSystemAccess2 fsa){
		
		// statemachine state transi
		fsa.generateFile('StateMachine.java', 
			templateStateMachineClass(stateMachine));
			
		fsa.generateFile('State.java', 
			templateStateClass(stateMachine.state.get(0)));
			
			fsa.generateFile('Transition.java', 
			templateTransitionClass(stateMachine.transition.get(0)));
			fsa.generateFile('StateType.java', 
			templateEnumType());
		
		fsa.generateFile("MainProgram.java",templateMainProgram(stateMachine));
	}
	def templateStateClass(State state){
		'''
			�templateState()�

		'''
	}
	def templateStateMachineClass(StateMachine sm){
		'''
		�templateStateMachine()�
		'''
	}
	def templateTransitionClass(Transition transition){
		'''
		�templateTransition()�
		'''
	}
	
	def templateClassHeader(String className, List<String> interfaces, List<String> extendClass){
		'''
		public class �className� 
		�IF interfaces.length() < 0 �
			implements 
			�FOR i : interfaces�
				i 
			�ENDFOR�
		�ENDIF�
		�IF extendClass.length() < 0 �
					extends 
					�FOR e : extendClass�
						e 
					�ENDFOR�
				�ENDIF�
		{
		'''
	}
	
	def templateState(){
		'''
		public class State{
		
			public String name;
			public StateType type;	
			
			State (String name,StateType t){
				this.name = name;
				this.type = t;
			}
			
			@Override
			public String toString() {
				return "State : name="+this.name+" , type="+this.type;
			}
			
			
			
		}
		'''
	}
	def templateEnumType(){
		'''
		public enum StateType {
					  Final,
					  First,
					  On,
					  Off;	
					}
		'''
	}
	
	def templateStateMachine(){
		'''
	import java.util.ArrayList;
	import java.util.List;
		
	public class StateMachine{
		public String name;
		public State currentState;
		public List<State> states;
		public List<Transition> transitions;
		
		StateMachine(String name){
			this.name = name;
			this.currentState = new State("first", StateType.First); 
			this.states = new ArrayList<State>();
			this.transitions = new ArrayList<Transition>();
		}
		
		@Override
		public String toString() {
			String str = "State Machine : name="+this.name+" ,current="+this.currentState+"\n";
			str += "[";
			for (State state : this.states){
				str += state.toString();
			}
				str += "]\n[";
			for (Transition transition : this.transitions){
				str += transition.toString();
			}
				str += "]";
			return str;
		}
	}
		
		'''
		
	}
	
	
	def templateTransition(){
		'''
	public class Transition {
		public String name;
		public State source;
		public State target;
		
		Transition(String name,State src,State tg){
			this.name = name;
			this.source = src;
			this.target = tg;
		}
		
		public State change(State current) {
			if (current != null  && current.type != target.type && current.type == source.type){
				return target;
			}
			return current;
		}
		
		@Override
		public String toString() {
			return "Transition : name="+this.name+" ,source="+this.source+" ,target="+this.target;
		}
	}
		'''
		
	}
	
	def templateMainProgram(StateMachine machine) {
		'''
		�templateClassHeader("MainProgram",newArrayList(),newArrayList())�
		�templateMainFunction(machine)�
		}
		'''
	}
	
	def templateMainFunction(StateMachine sm){
		'''
			public static void main(String[] args) {
				
				StateMachine �sm.name� = new StateMachine("�sm.name�");
				�FOR state : sm.state�
					State �state.name� = new State("�state.name�",StateType.On);
					�sm.name�.states.add(�state.name�);
				�ENDFOR�
				�FOR trans : sm.transition�
					Transition �trans.name� = new Transition("�trans.name�",�trans.source.name�,�trans.target.name�);
					�sm.name�.transitions.add(�trans.name�);
				�ENDFOR�
				System.out.println(�sm.name�.toString());
				for (Transition trans : �sm.name�.transitions) {
						�sm.name�.currentState = trans.change(�sm.name�.currentState);
				}
				
				System.out.println(�sm.name�.toString());
			}
		'''
	}
}


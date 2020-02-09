/**
 * generated by Xtext 2.14.0
 */
package ut2j.m1ice.generator;

import java.util.List;
import myFirstEditorCustom.State;
import myFirstEditorCustom.StateMachine;
import myFirstEditorCustom.Transition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class StateMachineGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    StateMachine myStateMachine = ((StateMachine) _get);
    this.generateAllClass(myStateMachine, fsa);
  }
  
  public void generateAllClass(final StateMachine stateMachine, final IFileSystemAccess2 fsa) {
    fsa.generateFile("StateMachine.java", 
      this.templateStateMachineClass(stateMachine));
    fsa.generateFile("State.java", 
      this.templateStateClass(stateMachine.getState().get(0)));
    fsa.generateFile("Transition.java", 
      this.templateTransitionClass(stateMachine.getTransition().get(0)));
    fsa.generateFile("StateType.java", 
      this.templateEnumType());
    fsa.generateFile("MainProgram.java", this.templateMainProgram(stateMachine));
  }
  
  public CharSequence templateStateClass(final State state) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _templateState = this.templateState();
    _builder.append(_templateState);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence templateStateMachineClass(final StateMachine sm) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _templateStateMachine = this.templateStateMachine();
    _builder.append(_templateStateMachine);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence templateTransitionClass(final Transition transition) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _templateTransition = this.templateTransition();
    _builder.append(_templateTransition);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence templateClassHeader(final String className, final List<String> interfaces, final List<String> extendClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      int _length = ((Object[])Conversions.unwrapArray(interfaces, Object.class)).length;
      boolean _lessThan = (_length < 0);
      if (_lessThan) {
        _builder.append("implements ");
        _builder.newLine();
        {
          for(final String i : interfaces) {
            _builder.append("i ");
            _builder.newLine();
          }
        }
      }
    }
    {
      int _length_1 = ((Object[])Conversions.unwrapArray(extendClass, Object.class)).length;
      boolean _lessThan_1 = (_length_1 < 0);
      if (_lessThan_1) {
        _builder.append("extends ");
        _builder.newLine();
        {
          for(final String e : extendClass) {
            _builder.append("e ");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("{");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence templateState() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class State{");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public StateType type;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("State (String name,StateType t){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.name = name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.type = t;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"State : name=\"+this.name+\" , type=\"+this.type;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence templateEnumType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public enum StateType {");
    _builder.newLine();
    _builder.append("\t\t\t  ");
    _builder.append("Final,");
    _builder.newLine();
    _builder.append("\t\t\t  ");
    _builder.append("First,");
    _builder.newLine();
    _builder.append("\t\t\t  ");
    _builder.append("On,");
    _builder.newLine();
    _builder.append("\t\t\t  ");
    _builder.append("Off;\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence templateStateMachine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class StateMachine{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State currentState;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<State> states;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Transition> transitions;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("StateMachine(String name){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.name = name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.currentState = new State(\"first\", StateType.First); ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.states = new ArrayList<State>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.transitions = new ArrayList<Transition>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String str = \"State Machine : name=\"+this.name+\" ,current=\"+this.currentState+\"\\n\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("str += \"[\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (State state : this.states){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("str += state.toString();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("str += \"]\\n[\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (Transition transition : this.transitions){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("str += transition.toString();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("str += \"]\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return str;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence templateTransition() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Transition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State source;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State target;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Transition(String name,State src,State tg){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.name = name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.source = src;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.target = tg;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State change(State current) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (current != null  && current.type != target.type && current.type == source.type){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return target;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return current;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"Transition : name=\"+this.name+\" ,source=\"+this.source+\" ,target=\"+this.target;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence templateMainProgram(final StateMachine machine) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _templateClassHeader = this.templateClassHeader("MainProgram", CollectionLiterals.<String>newArrayList(), CollectionLiterals.<String>newArrayList());
    _builder.append(_templateClassHeader);
    _builder.newLineIfNotEmpty();
    CharSequence _templateMainFunction = this.templateMainFunction(machine);
    _builder.append(_templateMainFunction);
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence templateMainFunction(final StateMachine sm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("StateMachine ");
    String _name = sm.getName();
    _builder.append(_name, "\t");
    _builder.append(" = new StateMachine(\"");
    String _name_1 = sm.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      EList<State> _state = sm.getState();
      for(final State state : _state) {
        _builder.append("\t");
        _builder.append("State ");
        String _name_2 = state.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" = new State(\"");
        String _name_3 = state.getName();
        _builder.append(_name_3, "\t");
        _builder.append("\",StateType.On);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_4 = sm.getName();
        _builder.append(_name_4, "\t");
        _builder.append(".states.add(");
        String _name_5 = state.getName();
        _builder.append(_name_5, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Transition> _transition = sm.getTransition();
      for(final Transition trans : _transition) {
        _builder.append("\t");
        _builder.append("Transition ");
        String _name_6 = trans.getName();
        _builder.append(_name_6, "\t");
        _builder.append(" = new Transition(\"");
        String _name_7 = trans.getName();
        _builder.append(_name_7, "\t");
        _builder.append("\",");
        String _name_8 = trans.getSource().getName();
        _builder.append(_name_8, "\t");
        _builder.append(",");
        String _name_9 = trans.getTarget().getName();
        _builder.append(_name_9, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_10 = sm.getName();
        _builder.append(_name_10, "\t");
        _builder.append(".transitions.add(");
        String _name_11 = trans.getName();
        _builder.append(_name_11, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("System.out.println(");
    String _name_12 = sm.getName();
    _builder.append(_name_12, "\t");
    _builder.append(".toString());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (Transition trans : ");
    String _name_13 = sm.getName();
    _builder.append(_name_13, "\t");
    _builder.append(".transitions) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _name_14 = sm.getName();
    _builder.append(_name_14, "\t\t\t");
    _builder.append(".currentState = trans.change(");
    String _name_15 = sm.getName();
    _builder.append(_name_15, "\t\t\t");
    _builder.append(".currentState);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(");
    String _name_16 = sm.getName();
    _builder.append(_name_16, "\t");
    _builder.append(".toString());");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
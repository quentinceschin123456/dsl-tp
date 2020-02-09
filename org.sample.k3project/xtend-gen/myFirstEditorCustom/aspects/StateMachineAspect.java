package myFirstEditorCustom.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import myFirstEditorCustom.State;
import myFirstEditorCustom.StateMachine;
import myFirstEditorCustom.Transition;
import myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  public static void execute(final StateMachine _self) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	myFirstEditorCustom.aspects.StateMachineAspect._privk3_execute(_self_, (myFirstEditorCustom.StateMachine)_self);
    };
  }
  
  private static StateMachine ma(final StateMachine _self) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# StateMachine ma()
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	result = myFirstEditorCustom.aspects.StateMachineAspect._privk3_ma(_self_, (myFirstEditorCustom.StateMachine)_self);
    };
    return (myFirstEditorCustom.StateMachine)result;
  }
  
  private static void ma(final StateMachine _self, final StateMachine ma) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void ma(StateMachine)
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	myFirstEditorCustom.aspects.StateMachineAspect._privk3_ma(_self_, (myFirstEditorCustom.StateMachine)_self,ma);
    };
  }
  
  private static State s1(final StateMachine _self) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State s1()
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	result = myFirstEditorCustom.aspects.StateMachineAspect._privk3_s1(_self_, (myFirstEditorCustom.StateMachine)_self);
    };
    return (myFirstEditorCustom.State)result;
  }
  
  private static void s1(final StateMachine _self, final State s1) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void s1(State)
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	myFirstEditorCustom.aspects.StateMachineAspect._privk3_s1(_self_, (myFirstEditorCustom.StateMachine)_self,s1);
    };
  }
  
  private static State s2(final StateMachine _self) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State s2()
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	result = myFirstEditorCustom.aspects.StateMachineAspect._privk3_s2(_self_, (myFirstEditorCustom.StateMachine)_self);
    };
    return (myFirstEditorCustom.State)result;
  }
  
  private static void s2(final StateMachine _self, final State s2) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void s2(State)
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	myFirstEditorCustom.aspects.StateMachineAspect._privk3_s2(_self_, (myFirstEditorCustom.StateMachine)_self,s2);
    };
  }
  
  private static Transition tr(final StateMachine _self) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Transition tr()
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	result = myFirstEditorCustom.aspects.StateMachineAspect._privk3_tr(_self_, (myFirstEditorCustom.StateMachine)_self);
    };
    return (myFirstEditorCustom.Transition)result;
  }
  
  private static void tr(final StateMachine _self, final Transition tr) {
    final myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectProperties _self_ = myFirstEditorCustom.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tr(Transition)
    if (_self instanceof myFirstEditorCustom.StateMachine){
    	myFirstEditorCustom.aspects.StateMachineAspect._privk3_tr(_self_, (myFirstEditorCustom.StateMachine)_self,tr);
    };
  }
  
  protected static void _privk3_execute(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field states is undefined for the type StateMachine"
      + "\nThe method or field transitions is undefined for the type StateMachine"
      + "\nThe method or field transitions is undefined for the type StateMachine"
      + "\nThe method currentState(Object) is undefined for the type StateMachine"
      + "\nThe method change(Object) is undefined for the type Transition"
      + "\nThe method or field currentState is undefined for the type StateMachine"
      + "\nInvalid number of arguments. The method s1(StateMachine) is not applicable without arguments"
      + "\nInvalid number of arguments. The method s2(StateMachine) is not applicable without arguments"
      + "\nInvalid number of arguments. The method tr(StateMachine) is not applicable without arguments"
      + "\nInvalid number of arguments. The method ma(StateMachine) is not applicable without arguments"
      + "\nInvalid number of arguments. The method ma(StateMachine) is not applicable without arguments"
      + "\nInvalid number of arguments. The method ma(StateMachine) is not applicable without arguments"
      + "\nadd cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  protected static StateMachine _privk3_ma(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMa") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (myFirstEditorCustom.StateMachine) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.ma;
  }
  
  protected static void _privk3_ma(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final StateMachine ma) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMa")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, ma);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.ma = ma;
    }
  }
  
  protected static State _privk3_s1(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getS1") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (myFirstEditorCustom.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.s1;
  }
  
  protected static void _privk3_s1(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final State s1) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setS1")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, s1);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.s1 = s1;
    }
  }
  
  protected static State _privk3_s2(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getS2") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (myFirstEditorCustom.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.s2;
  }
  
  protected static void _privk3_s2(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final State s2) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setS2")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, s2);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.s2 = s2;
    }
  }
  
  protected static Transition _privk3_tr(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTr") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (myFirstEditorCustom.Transition) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.tr;
  }
  
  protected static void _privk3_tr(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Transition tr) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTr")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, tr);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.tr = tr;
    }
  }
}

package myFirstEditorCustom.aspects;

import java.util.Map;
import myFirstEditorCustom.MyFirstEditorCustomPackage;
import myFirstEditorCustom.StateMachine;
import myFirstEditorCustom.aspects.StateMachineAspect;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class Interpreter {
  public static void main(final String[] args) {
    MyFirstEditorCustomPackage.eINSTANCE.getClass();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Resource resource = new ResourceSetImpl().getResource(URI.createURI("C:\\Users\\AdminEtu\\Desktop\\LocalWorkspace\\EclipseDSLWorkspace\\MyFirstEditorCustom\\model\\StateMachine.xmi"), true);
    EObject _get = resource.getContents().get(0);
    StateMachine myFSM = ((StateMachine) _get);
    StateMachineAspect.execute(myFSM);
  }
}

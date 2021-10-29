import org.aspectj.lang.Signature;

public aspect CambiarColor {
	pointcut cambiar() :call(* com.mycompany.ds.cambiar*(..) );
	before(): cambiar() {
		Signature sig = thisJoinPoint.getSignature();
        if(sig.toString().equals("void com.mycompany.ds.cambiarAmarillo")) {
        	System.out.println("Se cambio el color a amarillo");
        }else if(sig.toString().equals("void com.mycompany.ds.cambiarAzul")) {
        	System.out.println("Se cambio el color a azul");
        }else {
        	System.out.println("Se cambio el color a rojo");
        }
		
	}
}

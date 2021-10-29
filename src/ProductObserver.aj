
public aspect ProductObserver {
	pointcut actualizar() :call(* Producto.Producto.set*(..) );
	before(): actualizar() {
		System.out.println("Se ha actualizado el precio");
		
	}
}

import java.util.Observer;
import java.util.Scanner;

import Producto.Producto;

public class Main {
    public static void main(String[] args) {
    	Producto p1 = new Producto("Libro",3.99);
        Producto p2 = new Producto("Lector libros electrónico", 129);
        Observer o1 = new ProductoObserver();
        Producto.getObservable().addObserver(o1);
        p1.setPrecio(4.99);
        p2.setPrecio(119);
}
}

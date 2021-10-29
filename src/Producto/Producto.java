package Producto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Observable;
import java.util.ArrayList;
import java.util.List;
public class Producto {
	    public class PrecioEvent {
	        
	        private Producto producto;
	        private double precioAntiguo;
	        private double precioNuevo;
	        public PrecioEvent(Producto producto,  double precioAntiguo, double precioNuevo) {
	            this.producto = producto;
	            this.precioAntiguo = precioAntiguo;
	            this.precioNuevo = precioNuevo;
	        }
	        
	        public Producto getProducto() {
	            return producto;
	        }
	        
	        public double getPrecioAntiguo() {
	            return precioAntiguo;
	        }
	        
	        public double getPrecioNuevo() {
	            return precioNuevo;
	        }        
	    }

	    private static final ProductoObservable OBSERVABLE;

	    private String nombre;
	    private double precio;

	    static {
	        OBSERVABLE = new ProductoObservable();
	    }

	    public static Observable getObservable() {
	        return OBSERVABLE;
	    }

	    public Producto(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        PrecioEvent event = new PrecioEvent(this, this.precio, precio);

	        this.precio = precio;

	        synchronized (OBSERVABLE) {
	            OBSERVABLE.setChanged();
	            OBSERVABLE.notifyObservers(event);            
	        }
	    }
	    
	    private static class ProductoObservable extends Observable {
	        @Override
	        public synchronized void setChanged() {
	            super.setChanged();
	        }
	    }
	    
	}


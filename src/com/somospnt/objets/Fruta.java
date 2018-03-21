package com.somospnt.objets;

public class Fruta extends Producto {

	private String uniMed;
	public Fruta(String nombre, String uniMed, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
		this.uniMed = uniMed;
	}

	
	
	
	
	
	public String toString() {
		return "Nombre: " + getNombre() + " /// " + "Precio: $" + getPrecio() + " /// " + "Unidad de venta: " + uniMed;
	}
}

package com.somospnt.objets;

public class Bebida extends Producto {

	private float litros;
	public Bebida(String nombre, float litros, int precio) {
		super(nombre, precio);
		this.litros = litros;
		// TODO Auto-generated constructor stub
	}

	
	
	public String toString() {
		return "Nombre: " + getNombre() + " /// " + "litros: " + litros +" /// " + "Precio: $" + getPrecio();
	}
}

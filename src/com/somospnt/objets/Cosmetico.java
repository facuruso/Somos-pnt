package com.somospnt.objets;

public class Cosmetico extends Producto {
	private int contenido;
	
	public Cosmetico(String nombre, int contenido, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
		this.contenido = contenido;
	}

	public String toString() {
		return "Nombre: " + getNombre() + " /// " + "Contenido: " + contenido + "ml" + " /// " + "Precio: $" + getPrecio();
	}
}

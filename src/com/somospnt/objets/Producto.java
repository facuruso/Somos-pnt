package com.somospnt.objets;

public abstract class Producto implements Comparable<Producto> {

	private String Nombre;
	private int Precio;
	
	

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		this.Precio = precio;
	}

	public Producto(String Nombre, int Precio) {
		this.Nombre = Nombre;
		this.Precio = Precio;
	}

	
	public int compareTo(Producto p) {
		if (this.Precio < p.Precio) {
			return -1;
		}
		else if (this.Precio > p.Precio) {
			return 1;
		}
		else {
			return 0;
		}
	}

	
	
	
	
	
}

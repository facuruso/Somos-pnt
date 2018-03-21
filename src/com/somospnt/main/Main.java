package com.somospnt.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import com.somospnt.objets.Bebida;
import com.somospnt.objets.Cosmetico;
import com.somospnt.objets.Fruta;
import com.somospnt.objets.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iniciarLista();
		
		String listString = productos.stream()
				.map(Object::toString)
				.collect(Collectors.joining("\n"));
		System.out.println(listString);
		buscarMayorMenor();
	}
	
	public static ArrayList<Producto> productos = new ArrayList<>();
	
	public static  void iniciarLista() {
		productos.add(new Bebida("Coca-Cola Zero", 1.5F , 20));
		productos.add(new Bebida("Coca-Cola", 1.5F, 18));
		productos.add(new Cosmetico("Shampoo Sedal", 19, 500));
		productos.add(new Fruta("Frutillas", "Kilo", 64));
	}

	public static void buscarMayorMenor() {
		Collections.sort(productos);
		int size = productos.size();
		
		System.out.println("=============================");
		System.out.println("Producto más caro: " + productos.get(size-1).getNombre());
		System.out.println("Producto más barato: " + productos.get(0).getNombre());
	}
}

package com.laboratorio.tarea03;

public class AppArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo art1 = new Articulo();
		art1.id = 1;
		art1.marca = "Colgate";
		art1.nombre = "Cepillo dental";
		art1.precio = 4.5f;
		art1.stock = 20;
		
		System.out.println(art1.toString());
		
		
		Articulo art2 = new Articulo("Detergente 500gr", "Ariel", 2, 25, 8);
		System.out.println(art2.toString());
		
	}

}

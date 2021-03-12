package com.laboratorio.tarea03;

public class Articulo {
	String nombre;
	String marca;
	int id;
	int stock;
	float precio;
	
	public Articulo(String nombre, String marca, int id, int stock, float precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.id = id;
		this.stock = stock;
		this.precio = precio;
	}

	public Articulo() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", marca=" + marca + ", id=" + id + ", stock=" + stock + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
}

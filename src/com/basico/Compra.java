package com.basico;

public class Compra {

	private String email;
	private String producto;
	private int unidades;
	private float total;
	
	public Compra() {
		
	}
	
	public Compra(String email, String producto, int unidades) {
		setEmail(email);
		setProducto(producto);
		setUnidades(unidades);
		setTotal();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public void setTotal() {
		int precio = 0;
		switch(producto.toUpperCase()) {
		case "CAMISA":
			precio = 10;
			break;
		case "PANTALON":
			precio = 15;
			break;
		default:
			precio=30;
			break;
		}
		
		total = unidades*precio*1.21f;
		
	}
	
	public float getTotal() {
		return total;
	}
	
	
}

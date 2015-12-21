package com.ejemplos.beans;

import java.util.List;

public class Pais {
	private String nombre;
	private List<Ciudad> ciudades;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getCiudad() {
		return ciudades;
	}

	public void setCiudad(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}


	

}

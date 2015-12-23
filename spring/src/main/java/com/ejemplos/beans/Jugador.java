package com.ejemplos.beans;

import com.ejemplos.springframe.interfaces.IEquipo;

public class Jugador {
	private int numero;
	private String nombre;
	private IEquipo equipo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

}

package com.ejemplos.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.ejemplos.springframe.interfaces.IEquipo;

public class Jugador {
	private int numero;
	private String nombre;
	
	@Autowired
	private IEquipo equipo;
	
	public String getNombre() {
		return nombre;
	}
	@Required
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
	
	//@Required
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

}

package com.ejemplos.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	
	//Anotacion para definir value que antes era definido en beans.xml
	@Value("Hola Mundo")
	
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

}

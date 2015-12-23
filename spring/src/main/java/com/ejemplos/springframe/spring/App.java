package com.ejemplos.springframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.Jugador;
import com.ejemplos.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ejemplos/springframe/xml/beans.xml");
		Jugador jug = (Jugador) appContext.getBean("messi");//llamo al alias o apodo
		
		System.out.println(jug.getNombre() +"-"+jug.getEquipo().mostrar());
	

	}

}

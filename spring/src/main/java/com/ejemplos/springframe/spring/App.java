package com.ejemplos.springframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.Jugador;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ejemplos/springframe/xml/beans.xml");
		Jugador jug = (Jugador) appContext.getBean("jugador1");//llamo al alias o apodo
		
		//IEquipo bar =(IEquipo) appContext.getBean("barcelona");//juventus
		System.out.println(jug.getNombre() +"-"+jug.getEquipo().mostrar()+" - "+jug.getCamiseta().getNumero()+" - "+jug.getCamiseta().getMarca().getNombre() );
		//System.out.println(bar.mostrar());
		//Ejemplo de como porder usar las interfaces en spring
		((ConfigurableApplicationContext) appContext).close();
	

	}

}

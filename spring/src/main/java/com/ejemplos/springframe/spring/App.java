package com.ejemplos.springframe.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.Barcelona;
import com.ejemplos.beans.Jugador;
import com.ejemplos.beans.Juventus;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1- Barcelona 2- Juventus");
		int respuesta = sc.nextInt();
		switch(respuesta){
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
			break;
		default:
			break;
		}
		
		
		
		//IEquipo bar =(IEquipo) appContext.getBean("barcelona");//juventus
		System.out.println(jug.getNombre() +"-"+jug.getEquipo().mostrar()+" - "+jug.getCamiseta().getNumero()+" - "+jug.getCamiseta().getMarca().getNombre() );
		//System.out.println(bar.mostrar());
		//Ejemplo de como porder usar las interfaces en spring
		((ConfigurableApplicationContext) appContext).close();
	

	}

}

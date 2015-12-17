package com.ejemplos.springframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		//ASI FUNCIONABA CON JAVA CONVENCIONAL
		/*Mundo m = new Mundo();
		m.getSaludo();*/
		
		//CON SPRING
		//debo indicar la direccion del BEANS si es que no esta en el mismo paquete, si lo esta dejo en balnco la direccion.
		ApplicationContext appContext =	new ClassPathXmlApplicationContext("com/ejemplos/springframe/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");//tambien puede ser especificando la clase EJ: getBean(Mundo.class);
		System.out.println(m.getSaludo());
		
		//En caso de querer cerrar el recurso//
		((ConfigurableApplicationContext)appContext).close();

	}

}

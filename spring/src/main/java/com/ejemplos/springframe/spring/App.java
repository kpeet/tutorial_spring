package com.ejemplos.springframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.Ciudad;
import com.ejemplos.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ejemplos/springframe/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");//llamo al alias o apodo
		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");
	
		System.out.println(per.getApodo());
		System.out.println(ciu.getNombre());
		
		//En caso de querer cerrar el recurso//
		((ConfigurableApplicationContext)appContext).close();

	}

}

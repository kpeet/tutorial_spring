package com.ejemplos.springframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ejemplos/springframe/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");//llamo al alias o apodo
		
		//el objeto tiene scope singleton->por lo que un nuevo objeto no es mas que una 
		//referencia al objeto anteriormente creado
		Persona per2 = (Persona) appContext.getBean("persona");
		
		System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre());
		System.out.println(per2.getId()+" "+per2.getNombre()+" "+per2.getApodo()+" "+per2.getPais().getNombre()+" "+per2.getCiudad().getNombre());
		
		//En caso de querer cerrar el recurso//
		((ConfigurableApplicationContext)appContext).close();

	}

}

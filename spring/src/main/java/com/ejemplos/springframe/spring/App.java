package com.ejemplos.springframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ejemplos/springframe/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");//llamo al alias o apodo
		
		
		System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre());
	
		//En caso de querer cerrar el recurso//
		((ConfigurableApplicationContext)appContext).close();

	}

}

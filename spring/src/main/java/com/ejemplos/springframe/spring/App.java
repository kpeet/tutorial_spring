package com.ejemplos.springframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplos.beans.AppConfig;
import com.ejemplos.beans.AppConfig2;
import com.ejemplos.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		//ASI FUNCIONABA CON JAVA CONVENCIONAL
		/*Mundo m = new Mundo();
		m.getSaludo();*/
		
		//CON SPRING
		//debo indicar la direccion del BEANS si es que no esta en el mismo paquete, si lo esta dejo en balnco la direccion.
		
		//Comentado para realizar la anotación
		//ApplicationContext appContext =	new ClassPathXmlApplicationContext("com/ejemplos/springframe/xml/beans.xml");
		
		//Para las anotaciones es invocado AnnotationConfigApplicationContext() y dentro del parametro
		//indicamos la clase que define nuestros beans
		
		//Se ha agregado una nueva clase por anotacion ,AppConfig2.class
		ApplicationContext appContext =	new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
		
		//Se ha modificado el id del objeto que se esta invocando por "marte", que es un objeto de la clase AppConfig2
		Mundo m = (Mundo) appContext.getBean("marte");//tambien puede ser especificando la clase EJ: getBean(Mundo.class);
		System.out.println(m.getSaludo());
		
		//En caso de querer cerrar el recurso//
		((ConfigurableApplicationContext)appContext).close();

	}

}

package com.ejemplos.springframe.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejemplos.beans.Barcelona;
import com.ejemplos.beans.Camiseta;
import com.ejemplos.beans.Jugador;
import com.ejemplos.beans.Juventus;
import com.ejemplos.beans.Marca;

@Configuration
public class AppConfig {
	//Aca definimos el bean que estaba en el beans.xml
	
	@Bean
	public Jugador jugador1(){
		return new Jugador();
	}
	@Bean
	public Barcelona barcelona(){
		return new Barcelona();
	}
	/* Si colocamos barcelona1 el sistema no lo elijira,
	 *  porque tiene preferencia por tener su nombre igual a  como se indica en el qualifier*/
	@Bean
	public Barcelona barcelona1(){
		return new Barcelona();
	}
	@Bean
	public Juventus juventus(){
		return new Juventus();
	}
	@Bean
	public Camiseta camiseta(){
		return new Camiseta();
	}
	@Bean
	public Marca marca(){
		return new Marca();
	}
	

}

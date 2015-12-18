package com.ejemplos.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	//al definir el @Configuration y @Bean estoy reemplazando 
	//el beans Mundo instanciado en el archivo XML -> beans.xml 
	/* Lo declara en beans.xml 
	 
	<bean id="mundo" class="com.ejemplos.beans.Mundo">
		<property name="saludo" value="Hola jojojo!"></property>
	</bean>
	
	      :con XML  => con Anotaciones
	mundo :    id   => nombre del método 
	Mundo : class="com.ejemplos.beans.Mundo" => Clase implementada
	
	*/
	@Bean
	public Mundo mundo(){
		return new Mundo();
		//retorna una instancia de mundo
	}

}

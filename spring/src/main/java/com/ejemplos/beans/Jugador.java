package com.ejemplos.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ejemplos.springframe.interfaces.IEquipo;

@Component
public class Jugador {
	private int id;
	@Value("Kenneth")
	private String nombre;
	
	@Autowired
	@Qualifier("barcelona")/*<- El codigo no genera error con el AppConfig del
							paquete com...spring, porque esta este Qualifier que le 
							indica al sistema cual seleccionar. Si no lo tiene, el sistema 
							tira error porque tiene dos bean con las mismas caracteristicas
	 
	 */
	private IEquipo equipo;//<- va a permitir cambiardinamicamente de equipo
	
	@Autowired
	private Camiseta camiseta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	

}

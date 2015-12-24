package com.ejemplos.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.ejemplos.springframe.interfaces.IEquipo;

@Controller //Controller - Service - Repository
/*
 @Component: para definir un bean de manera genérica
@Repository: Para la capa de datos, donde es común usar el patrón DAO.
@ Controller: en la capa controlador, con alusión al patrón MVC.
@ Service:para la capa que va a consumir nuestros accesos a datos.
Pero todas hacen el mismo efecto, solo sirven para hacer una diferenciación de capas.

 */
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Barcelona FC";
	}
	

}

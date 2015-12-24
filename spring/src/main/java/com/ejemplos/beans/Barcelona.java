package com.ejemplos.beans;

import org.springframework.stereotype.Component;

import com.ejemplos.springframe.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Barcelona FC";
	}
	

}

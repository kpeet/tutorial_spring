package com.ejemplos.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MitoCodeBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("postProcessBeforeInitialization Antes de la inicializaci{on: "+ nombreBean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("postProcessAfterInitialization Despues de la inicializaci{on: "+ nombreBean);
		return bean;
	}

}

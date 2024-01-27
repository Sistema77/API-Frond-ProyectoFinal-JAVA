package com.ProyectoFinal.APIFrond.Excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResolucionNoEncontradaExcepcion extends RuntimeException{
	
	/**
	 * Creo una nueva Exception para controlar cunado la API no encuentre el ID 
	 */
	private static final long serialVersionUID = 1L;

	
	public ResolucionNoEncontradaExcepcion(String mensaje) {
		super(mensaje);
	}
}
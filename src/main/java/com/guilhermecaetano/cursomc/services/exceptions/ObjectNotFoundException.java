package com.guilhermecaetano.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	private static final long serialVersionUID = 1L;

}

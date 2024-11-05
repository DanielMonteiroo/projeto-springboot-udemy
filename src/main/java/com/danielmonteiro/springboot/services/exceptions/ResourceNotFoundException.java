package com.danielmonteiro.springboot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	//Tratamento de exceção  para usuário não encontrado pelo Id
	public ResourceNotFoundException(Object id) {
        super("Recurso não encontrado. Id = " + id);
	}
	
	

}

package com.guimcarneiro.osworks.domain.exception;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = -8067940371049578853L;
	
	public NegocioException(String message) {
		super(message);
	}
	
}

package com.financial.exception;

public class NotParsableContentException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1292352622165304226L;
	
	
	public NotParsableContentException(String message) {
		super(message);		
	}
	
	public NotParsableContentException(String message, Throwable cause){
		super(message, cause);
	}

}

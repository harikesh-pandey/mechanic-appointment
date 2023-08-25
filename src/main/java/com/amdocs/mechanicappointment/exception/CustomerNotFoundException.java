package com.amdocs.mechanicappointment.exception;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1631823366296521859L;
	
	public CustomerNotFoundException() {
		super();
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}
	
}

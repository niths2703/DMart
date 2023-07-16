package com.dmartready.demo.exception;

public class StoreLocationException extends RuntimeException {

	public StoreLocationException() {
		
	}
	
    public StoreLocationException(String message) {
		super(message);
	}
}

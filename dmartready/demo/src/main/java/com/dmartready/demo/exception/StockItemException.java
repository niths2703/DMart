package com.dmartready.demo.exception;

public class StockItemException extends RuntimeException{

	public StockItemException() {
		
	}
	
	public StockItemException(String message) {
		super(message);
	}
}

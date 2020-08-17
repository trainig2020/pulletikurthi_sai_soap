package com.satya.soap;

public class InvalidException extends Exception {
	
	private String errorDetails;
	
	public InvalidException(String reason , String errorDetails) {
		super(reason);
		this.errorDetails=errorDetails;
		
		
	}
	public String getFaultInfo() {
		return errorDetails;
	}

}

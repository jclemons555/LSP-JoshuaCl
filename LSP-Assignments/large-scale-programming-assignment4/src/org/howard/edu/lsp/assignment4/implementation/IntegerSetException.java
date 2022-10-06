package org.howard.edu.lsp.assignment4.implementation;

public class IntegerSetException extends RuntimeException {
	
	/**
	 * Exception class for IntegerSet
	 */
	private static final long serialVersionUID = 1L;

	public IntegerSetException(String errormsg) {
		super(errormsg);
	}
}
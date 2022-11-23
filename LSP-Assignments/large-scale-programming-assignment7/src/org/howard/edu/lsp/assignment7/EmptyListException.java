package org.howard.edu.lsp.assignment7;

public class EmptyListException extends Exception {
	private static final long serialVersionUID = 4234993680915322637L;
	/**
	 * @return void
	 * constructor to display the error message
	 * throws the exception message
	 */
	public EmptyListException() {

		super("The list cannot be empty");
	}
}

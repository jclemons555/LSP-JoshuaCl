package org.howard.edu.lsp.midterm.problem1;

public class UnknownCandidateException extends RuntimeException {
	/**
	 * Exception class for votingMachine
	 */
	private static final long serialVersionUID = 1L;

	public UnknownCandidateException(String errormsg) {
		super(errormsg);
	}
}
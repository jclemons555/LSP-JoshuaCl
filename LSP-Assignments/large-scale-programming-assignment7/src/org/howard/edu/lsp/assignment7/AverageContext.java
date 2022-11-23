package org.howard.edu.lsp.assignment7;
import java.util.*;

/**
 * Joshua Clemons
 * @author jclemons
 *
 */

public class AverageContext {
	
	/**
	 * The AverageStrategy algorithm used to compute the average with.
	 */
	
	private AverageStrategy strategy;
	
	/**
	 * This method establishes the average computing algorithm (AverageStrategy)
	 * @param AverageStrategy algorithm 
	 */
	
	public void getAverageStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}
	
	int Average(List<Integer> grades) throws EmptyListException {
		try {
			int avg = strategy.compute(grades);
			return avg;
		}
		catch(EmptyListException e) {
			throw new EmptyListException();
		}
		
	}
	
	/**
	 * This method returns average grade from a list of grades.
	 * @param grades 
	 * @return average grade from list.
	 * @throws EmptyListException
	 */
	
	public int compute(List<Integer> grades) throws EmptyListException{
		int avg = this.strategy.compute(grades);
		return avg;
	}
}

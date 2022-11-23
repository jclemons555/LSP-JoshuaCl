package org.howard.edu.lsp.assignment7;
import java.util.*;

/**
 * Joshua Clemons
 * @author jclemons
 *
 */

public class AverageContext {
	
	private AverageStrategy strategy;
	
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
	
	public int compute(List<Integer> grades) throws EmptyListException{
		int avg = this.strategy.compute(grades);
		return avg;
	}
}


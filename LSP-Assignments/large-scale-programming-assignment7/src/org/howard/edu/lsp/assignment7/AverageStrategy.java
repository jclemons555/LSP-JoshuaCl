package org.howard.edu.lsp.assignment7;

import java.util.List;

/**
 * This interface contains method which returns the average grade from list.
 * @param grades
 * @return the average grade from the list of grades.
 * @throws EmptyListException
 */
public interface AverageStrategy {

	public int compute(List<Integer> grades) throws EmptyListException;

	

}

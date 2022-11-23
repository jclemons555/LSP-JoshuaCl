package org.howard.edu.lsp.assignment7;

import java.util.List;

public class TotalAverageStrategy implements AverageStrategy {
	@Override
	/**
	 * This method returns the average grade from a list of grades without dropping any grades.
	 * @param grades
	 * @return average grade from list of grades.
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		
		int totalnum = 0;
		for (int num: grades) {
			totalnum += num;
		}
		
		int avg = Math.round((float) totalnum / (float) grades.size());
		
		if (grades.size() == 0) {
			throw new EmptyListException();
		}
		
		return avg;
	}

}

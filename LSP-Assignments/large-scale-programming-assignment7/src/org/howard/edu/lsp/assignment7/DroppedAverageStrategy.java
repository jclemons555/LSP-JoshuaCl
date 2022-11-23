package org.howard.edu.lsp.assignment7;
import java.util.Collections;
import java.util.List;

/**
 * This method returns the average grade from a list of grades after dropping the two lowest scores.
 * If the size of the list is less than or equal to 2, it computes the average grade from the list without dropping grades.
 * @param grades 
 * @return average grade from the list after dropping the two lowest grades.
 * @throws EmptyListException
 */
public class DroppedAverageStrategy implements AverageStrategy {

	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		int totalnum = 0;
		int average; 
		
		if (grades.size() == 0) {
			throw new EmptyListException();
		}
		
		else if (grades.size() <= 2) {
			for (int x=0; x<grades.size(); x++) {
				totalnum += grades.get(x);
			}
			average = totalnum / grades.size();
		}
		
		else {
			Collections.sort(grades);
		    grades.remove(0);
		    grades.remove(0);
			for (int x=0; x<grades.size(); x++) {
				totalnum += grades.get(x);
			}
			average = totalnum / (grades.size());
		}
		
		return average;
	}
	
	
}

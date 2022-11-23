package org.howard.edu.lsp.assignment7;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Driver {

	@Test
	@DisplayName("Test cases for both strategies (TotalAverageStrategy & DroppedAverageStrategy to compute with more than 2 grades")
	public void testCompute() {
		AverageContext average = new AverageContext();
		List<Integer> gradeset = new ArrayList<Integer>();
		
		gradeset.add(10);
		gradeset.add(14);
		gradeset.add(16);
		gradeset.add(22);
		gradeset.add(8);

		
		average.getAverageStrategy(new TotalAverageStrategy());
		try {
			assertEquals(14, average.compute(gradeset));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		
		average.getAverageStrategy(new DroppedAverageStrategy());
		try {
			assertEquals(17, average.compute(gradeset));
		} catch (EmptyListException e) {
			e.printStackTrace();
			}
		
		}
		
	@Test
	@DisplayName("Test cases for both strategies (TotalAverageStrategy & DroppedAverageStrategy to compute with less than 3 grades")
	public void testComputeNoScoresDropped() {
		AverageContext average = new AverageContext();
		List<Integer> gradeset = new ArrayList<Integer>();
			
		gradeset.add(20);
		gradeset.add(24);
		
	
			
		average.getAverageStrategy(new TotalAverageStrategy());
		try {
			assertEquals(22, average.compute(gradeset));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		average.getAverageStrategy(new DroppedAverageStrategy());
		try {
			assertEquals(22, average.compute(gradeset));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	
	}
	
		@Test
	@DisplayName("Test cases for when both strategies (TotalAverageStrategy & DroppedAverageStrategy) throw an EmptyListException")
	public void testEmptyListException() {
		AverageContext average = new AverageContext();
		List<Integer> gradeset = new ArrayList<Integer>();
		
		average.getAverageStrategy(new TotalAverageStrategy());
		EmptyListException exception = assertThrows(EmptyListException.class, () -> {
			System.out.println(average.compute(gradeset));
			});
		String expectedMessage = "The list cannot be empty";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
		
		
		List<Integer> gradeset2 = new ArrayList<Integer>();
		
		average.getAverageStrategy(new DroppedAverageStrategy());
		EmptyListException exception2 = assertThrows(EmptyListException.class, () -> {
			System.out.println(average.compute(gradeset2));
			});
		
		String expectedMessage2 = "The list cannot be empty";
		String actualMessage2 = exception2.getMessage();
		assertTrue(actualMessage2.contains(expectedMessage2));
		
	}

	}

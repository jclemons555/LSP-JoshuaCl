package org.howard.edu.lsp.assignment2;

public class Driver {

	public static void main(String[] args) {
		Combinations comb = new Combinations();
		
		System.out.println(comb.compute(new int[]{5,5,15,10}, 15));
		System.out.println(comb.compute(new int[]{1,2,3,4,5}, 16));
		System.out.println(comb.compute(new int[]{1,2,3,4,5,6}, 8));
		System.out.println(comb.compute(new int[]{5,15,10,3,7,8,2}, 15));
		System.out.println(comb.compute(new int[]{12,3,2,5,7,9,8,11}, 11));
		
	}

}

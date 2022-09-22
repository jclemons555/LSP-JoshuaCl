package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;
import java.util.Arrays;
/*
 Large Scale Programming Assignment 2
 Author: Joshua Clemons
 @02914187 
	     */

public class Combinations{
	public ArrayList<ArrayList> compute(int [] input, int sum){
		ArrayList <ArrayList> ansArray = new ArrayList<>();
		for (int j = 0; j < input.length; j ++){
	     //if one number is equal to the given sum get arraylist of integer
	      if (input[j] ==sum){
	    	  ArrayList <Integer> oneNum = new ArrayList<>(Arrays.asList(j));
	        
	    	  ansArray.add(oneNum);
	        continue;
	      }
	      //if two or more is equal to the given sum get arraylist of integer
	      ArrayList <Integer> twoNum = new ArrayList<>();
	      twoNum.add(j);
	      ArrayList <Integer> mutliNum = new ArrayList<>();
	      mutliNum.add(j);
	      int iterLoop = 0;
	      //keep track of the sum
	      int suplLoop = input[j];
	      iterLoop += input[j];
	      for (int x = j + 1; x < input.length; x ++){
	    	//if sum of numbers equals to desired sum append indexes   
	    	  if (input[j] + input[x] == sum){
		        twoNum.add(x);
		        ArrayList <Integer> newArr = new ArrayList<>();
		        for (int elem = 0; elem < twoNum.size(); elem++) {
		        	newArr.add(twoNum.get(elem));
		    
		          }
		          ansArray.add(newArr);
		          
		        }
	           //if the sum of numbers is less than desired sum, keep appending the index of elements
	    	  if (suplLoop + input[x] < sum){
	        	mutliNum.add(j);
	        	iterLoop += input[x];
	        //if sum is equal create arraylist to store the indexes of numbers that equal to the desired target sum
	          if (iterLoop == sum){
	            ArrayList <Integer> desiredSum = new ArrayList<>();
	            for (int elem = 0; elem < mutliNum.size(); elem++) {
	            	desiredSum.add(mutliNum.get(elem));
	            }
	            //appending those indexes to the output array
	            ansArray.add(desiredSum);
	         }
	        }	

	        
	      } 
	    }
	   // return new array 
	    return ansArray;
	    
	  }
	



	}
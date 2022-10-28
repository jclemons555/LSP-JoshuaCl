package org.howard.edu.lsp.midterm.problem2;

public class Driver {
	public static void main(String[] args) {
		Person person1 = new Person("Jake", "12345", 22);
        Person person2 = new Person("Jill", "32114", 21);
        Person person3 = new Person("Jake", "12345", 22);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		if (person1.equals(person2)) {
		    System.out.println("These are the same people!");
		} else {
		    System.out.println("These are not the same people!");
		}
		if (person2.equals(person3)) {
		    System.out.println("These are the same people!");
		} else {
		    System.out.println("These are not the same people!");
		}
		if (person1.equals(person3)) {
		    System.out.println("These are the same people!");
		} else {
		    System.out.println("These are not the same people!");
		}
		
	}
}
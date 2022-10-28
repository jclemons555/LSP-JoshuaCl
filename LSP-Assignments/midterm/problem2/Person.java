package org.howard.edu.lsp.midterm.problem2;

public class Person { 
	private String name;
	private int age; 
	private String socialSecurityNumber;
	
	public Person(String name,  String socialSecurityNumber, int age) {
		// initialize private variables
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.age = age;
	}
	
	//override the default implementation of the toString() method and return the person’s name
	@Override
    public String toString() {
		
        return "Name: " + name + ". Age: " + age + ". Social Security Number: " + socialSecurityNumber;
    }
	//override the default implementation of the equals(Object) method
	@Override
    public boolean equals(Object match) {
        if (match == this) {
            return true;
        }
        if (!(match instanceof Person)) {
            return false;
        }
        Person secondPerson = (Person) match;
        return socialSecurityNumber.equals(secondPerson.socialSecurityNumber);
    }
} 
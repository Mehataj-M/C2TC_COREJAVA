package com.mehataj.assignment2;

public class Employee {
	// Base class for Employee
	
	    protected String name;
	    protected int age;
	    protected String designation;
	    protected double salary;

	    // Constructor for Employee
	    public Employee(String name, int age, String designation, double salary) {
	        this.name = name;
	        this.age = age;
	        this.designation = designation;
	        this.salary = salary;
	    }

	    // Method to display employee details
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Designation: " + designation);
	        System.out.println("Salary: " + salary);
	    }

}

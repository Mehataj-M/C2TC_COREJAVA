package com.mehataj.assignment2;

public class Manager {
	    private String department;

	    // Constructor for Manager
	    public Manager(String name, int age, String designation, double salary, String department) {
	        super(name, age, designation, salary);
	        this.department = department;
	    }

	    // Overriding the displayDetails method
	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Department: " + department);
	    }
}

package com.tns.ifet.day08.interfaces.markerinterfaces;

//Usage of the marker interface

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}


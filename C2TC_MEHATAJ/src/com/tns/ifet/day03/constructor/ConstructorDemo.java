package com.tns.ifet.day03.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("Enter Customer ID : ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer NAME : ");
		name = sc.nextLine();
		System.out.println("Enter Customer CITY : ");
		city = sc.nextLine();
		
		System.out.println(" ");
		
		Customer c1 = new Customer();
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		System.out.println("Enter Customer ID : ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer NAME : ");
		name = sc.nextLine();
		System.out.println("Enter Customer CITY : ");
		city = sc.nextLine();
		
		Customer c2 = new Customer(name,id,city);
		System.out.println(c2);
		sc.close();
			
	}

}

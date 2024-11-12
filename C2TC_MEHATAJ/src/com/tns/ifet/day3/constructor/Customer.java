package com.tns.ifet.day3.constructor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	
	public Customer() {
		System.out.println("Default Constructor");
	}
	
	public Customer(String customerName, int customerId, String customerCity) {
		this();
		System.out.println("parametrized constructor");
		this.setCustomerName(customerName);
		this.setCustomerId(customerId);
		this.setCustomerCity(customerCity);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	public String toString() {
		return "Customer [customer name = " +customerName +",customerId = " +customerId +",customerCity = " +customerCity +"]";
	}
	
}

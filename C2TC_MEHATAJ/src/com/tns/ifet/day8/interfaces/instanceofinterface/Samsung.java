package com.tns.ifet.day8.interfaces.instanceofinterface;

//Program to define concrete class that implements the Phone interface.

public class Samsung implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using Samsung");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Samsung");

	}

}


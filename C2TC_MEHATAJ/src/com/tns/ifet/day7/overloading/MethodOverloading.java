package com.tns.ifet.day7.overloading;

//Program to demonstrate method overloading  - Compile Time Polymorphism

public class MethodOverloading {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static float addition(float a, float b) {
		return a + b;
	}

	public static float addition(int a, float b) {
		return a + b;
	}

	public static float addition(float a, int b) {
		return a + b;
	}

	public static String addition(String a, String b) {
		return a + b;
	}

}


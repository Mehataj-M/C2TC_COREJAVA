package com.tns.ifet.day8.interfaces.nestedinterfaces;

//Nested Interface

public interface MyInterface {
	 void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
}

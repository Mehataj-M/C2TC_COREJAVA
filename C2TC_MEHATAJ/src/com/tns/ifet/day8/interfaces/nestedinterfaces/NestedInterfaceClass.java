package com.tns.ifet.day8.interfaces.nestedinterfaces;

//Child class implements inner interface

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		 System.out.println("Print method of nested interface");
	}

	

}
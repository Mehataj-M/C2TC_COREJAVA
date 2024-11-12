package com.tns.ifet.day3;

public class ParameterConstructor {
	
	ParameterConstructor(int a){
		System.out.println(a);
	}
	ParameterConstructor(int a,int b){
		System.out.printf(a+" "+ b);

	}
	ParameterConstructor(int a,char b){
		System.out.println(b);

	}
	ParameterConstructor(int a,char b,int c){
		System.out.println(c);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterConstructor pc2 = new ParameterConstructor(11);
		ParameterConstructor pc3 = new ParameterConstructor(12,13);
		ParameterConstructor pc4 = new ParameterConstructor(10,'a');
		ParameterConstructor pc1 = new ParameterConstructor(11,'a',12);
		System.out.println("HELLO");
	}

}

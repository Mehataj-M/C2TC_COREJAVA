package com.tns.ifet.day1;

public class IdentifiersDemo {
	/*
	 identifiers rules:
	 should not start with numbers but can have numbers.
	 don't have special symbols but can have underscore.
	 can have alphabets from a-z to A-Z.
	 can't have keywords as name.
	 it is case sensitive
	 can start with alphabets and underscore.have maximum length 40 characters and in C it is 31.
	 cannot have whitespace.
	 */
	
	
	// correct identifier name:
	
	public static void main(String[] args) {
		
		int num_1 = 10; //underscore and numbers
		char AlpHabet = 'a'; //uppercase with lowercase alphabets
		int Num_1 = 11; //case sensitive
		
		System.out.printf("%d \n%c \n%d" ,+num_1,+AlpHabet,+Num_1);
	}

	
	
}

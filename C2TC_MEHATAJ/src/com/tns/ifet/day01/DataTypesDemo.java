package com.tns.ifet.day01;

public class DataTypesDemo {

	public static void main(String[] args) {
		/*
		 
		 2 types of data types:
			 i) primitive  
					 byte  		1 byte
					 short 		2 byte
					 int 		4 byte	7 to 8 decimal digits
					 long 		8 byte
					 float 		4 byte
					 double 	8 byte	15 decimal digits
					 boolean 	1 bit
					 char		2 byte
			 ii) non primitive 
			 
		 
		 */
		
		int value1 = 9 / 2; //integer division
		float value2 = 101 / 61;
		double value3 = 10d / 6d;
		float value4 = 5/2.5f; //float division
		System.out.println("value 1=" + value1); 
		System.out.println("value 2=" + value2);
		System.out.println("value 3=" + value3);
		System.out.println("value 4=" + value4);
		int marker = 512;
		//assigning expression to variable 
		double percentage = marker * 0.46f;
		System.out.println("percentage :" + percentage);
																													
	}

}

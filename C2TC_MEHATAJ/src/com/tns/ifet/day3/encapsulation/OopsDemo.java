package com.tns.ifet.day3.encapsulation;

public class OopsDemo {
	private int regNo;
	private String name;
	private int age;
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "OopsConceptDemo [Reg No = " +regNo +", name = " +name +", age = " +age +"]";
	}
	
	}

	

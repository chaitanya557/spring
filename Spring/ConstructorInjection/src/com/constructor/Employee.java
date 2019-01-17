package com.constructor;

public class Employee {
	private String name;

	public Employee(String name) {
		this.name=name;
	}
	 void display() {
		 System.out.println("hello Mr." +name);
	 }
}

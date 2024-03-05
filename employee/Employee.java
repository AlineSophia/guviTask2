package com.guvi.employee;

import java.util.Scanner;

public class Employee extends Person {

	//Constructor of employee class
	Employee(String name, int age) {
		super(name, age); // Calling the super class constructor
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String inputName = scanner.next(); // Get the employee name
		System.out.println("Enter the employee age");
		int inputAge = scanner.nextInt(); // Get the employee age
		Employee emp = new Employee(inputName, inputAge);
		// Print the values
		System.out.println("The employee name is " + emp.name);
		System.out.println("The employee age is " + emp.age);

	}

}

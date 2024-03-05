package com.guvi.oops;

import java.util.Scanner;

public class Person {
	// Initializing variable
	int age;
	String name;

	// Initializing values using constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display name and age
	void displayPerson() {
		System.out.println("The name is " + name);
		System.out.println("The age is " + age);
	}

	// Main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Person name");
		String inputName = scanner.next(); // Get the employee name
		System.out.println("Enter the Person age");
		int inputAge = scanner.nextInt(); // Get the employee age
		// Object creation and calling the constructor
		Person p = new Person(inputName, inputAge);
		p.displayPerson();

	}

}

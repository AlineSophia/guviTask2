package com.guvi.oops;

import java.util.Scanner;

public class Account {
	//Initializing vailables
	private int balance = 5000;
	private int amount;

	// Zero Parameter Constructor
	Account() {

	}

	// Two Parameter Constructor
	Account(int amount, int balance) {
		this.balance = balance;
		this.amount = amount;
	}

	// Method to deposit the amount
	int deposit(int amount) {
		balance = balance + amount; // Adding the amount
		return balance;
	}

	// Method to Withdraw the amount
	int withdraw(int amount) {
		if (amount < balance) {
			balance = balance - amount; // Subtracting the amount
		} else {
			System.out.println("You have insufficient amount to withdraw");
		}

		return balance;
	}

	// Method to display the amount
	void dislayBalance() {
		System.out.println("The available balance is : " + this.balance);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account acc = new Account();
		int flag = 1;
		int value;
		// While loop to continue the opertaion
		while (flag == 1) {
			System.out.print("Do you want to Deposit or Withdraw or CheckBalance");
			String ans = scanner.next();
			// Condition for depositing the amount
			if (ans.equalsIgnoreCase("deposit")) {
				System.out.println("Enter the amount you want to Deposit");
				value = scanner.nextInt(); // getting the amount from the user
				acc.deposit(value); // calling the deposit method
				System.out.println("You have successfully deposited the amount");
				acc.dislayBalance(); // calling method to display
				System.out.println("Do you want to continue Y/N");
				String proceed = scanner.next();
				if (proceed.equalsIgnoreCase("n")) {
					flag = 0;
				}
			} else if (ans.equalsIgnoreCase("withdraw")) { // Condition for withdraw the amount
				System.out.println("Enter the amount you want to Withdraw");
				value = scanner.nextInt(); // getting the amount from the user
				acc.withdraw(value); // calling the withdraw method
				System.out.println("You have successfully withdrawn the amount");
				acc.dislayBalance(); // calling method to display
				System.out.println("Do you want to continue Y/N");
				String proceed = scanner.next();
				if (proceed.equalsIgnoreCase("n")) {
					flag = 0;
				}
			} else if (ans.equalsIgnoreCase("CheckBalance")) { // Condition to check the balance anmount
				acc.dislayBalance(); // calling method to display
				System.out.println("Do you want to continue Y/N");
				String proceed = scanner.next();
				if (proceed.equalsIgnoreCase("n")) {
					flag = 0;
				}
			} else { // Contion to validate invalid input
				System.out.println("Invalid Input");
				System.out.println("Do you want to continue Y/N");
				String proceed = scanner.next();
				if (proceed.equalsIgnoreCase("n")) {
					flag = 0;
				}
			}
		}
	}

}

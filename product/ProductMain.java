package com.guvi.product;

import java.util.Scanner;

public class ProductMain extends Product {
	// Zero Parameterized Constructor
	ProductMain() {

	}

	// Parameterized constructor
	ProductMain(int pid, int price, int quantity) {
		super(pid, price, quantity);
	}

	// Method to calculate the totalAmount
	void calculateTotalAmount(Product[] product) {
		int totalAmount = 0;
		// Iterate the array of product object
		for (int i = 1; i <= product.length - 1; i++) {
			// Calculate the total amount
			totalAmount = product[i].price * product[i].quantity;
			System.out.println("The total Amount spent on product " + product[i].pid + " is " + totalAmount);
		}
	}

	public static void main(String[] args) {
		// Declaring the size of an array
		int size = 6;
		Product[] arr = new Product[size];
		// Initializing scanner to get the input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Product Information for " + size + "Products\n");
		
		// Getting the user input for Products
		for (int i = 1; i <= size - 1; i++) {
			System.out.print("Enter the Product Id for " + i);
			int pid = scanner.nextInt();
			System.out.print("Enter the Product Price for " + i);
			int price = scanner.nextInt();
			System.out.print("Enter the Product Quantity for " + i);
			int quantity = scanner.nextInt();
			arr[i] = new Product(pid, price, quantity);
		}

		// Finding the HighestPrice Product id
		int highestPrice = 0;
		int productPid = 0;
		// Iterate the array of product object
		for (int i = 1; i <= arr.length - 1; i++) {
			if (highestPrice < arr[i].price) {
				highestPrice = arr[i].price;
				productPid = arr[i].pid;
			}
		}
		System.out.println("The product id of the highest price is " + productPid);
		// Creating an object
		ProductMain pm = new ProductMain();
		// Calling the instance method
		pm.calculateTotalAmount(arr);

	}

}

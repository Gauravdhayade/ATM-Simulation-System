package com.atm;

import java.util.Scanner;

public class ATM {
	private User currentUser;
	private boolean sessionActive = false;

	public void start(User user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("💳 Welcome to Simple ATM!");
		System.out.print("Enter your PIN: ");
		int enteredPin = sc.nextInt();

		if (user.verifyPin(enteredPin)) {
			currentUser = user;
			sessionActive = true;
			System.out.println("✅ Login Successful!");
			showMenu(sc);
		} else {
			System.out.println("❌ Incorrect PIN! Please try again.");
		}
	}

	private void showMenu(Scanner sc) {
		while (sessionActive) {
			System.out.println("\n===== ATM MENU =====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("💰 Your current balance: ₹" + currentUser.getAccount().getBalance());
				break;

			case 2:
				System.out.print("Enter deposit amount: ");
				double depositAmount = sc.nextDouble();
				currentUser.getAccount().deposit(depositAmount);
				break;

			case 3:
				System.out.print("Enter withdrawal amount: ");
				double withdrawAmount = sc.nextDouble();
				currentUser.getAccount().withdraw(withdrawAmount);
				break;

			case 4:
				System.out.println("👋 Thank you for using the ATM. Goodbye!");
				sessionActive = false;
				break;

			default:
				System.out.println("❌ Invalid option! Please try again.");
			}
		}
	}
}

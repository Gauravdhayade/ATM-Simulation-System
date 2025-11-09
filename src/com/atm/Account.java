package com.atm;

public class Account {
	private double balance;

	public Account(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("✅ Amount deposited successfully!");
		} else {
			System.out.println("❌ Invalid deposit amount!");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("✅ Withdrawal successful!");
		} else if (amount > balance) {
			System.out.println("❌ Insufficient balance!");
		} else {
			System.out.println("❌ Invalid withdrawal amount!");
		}
	}
}

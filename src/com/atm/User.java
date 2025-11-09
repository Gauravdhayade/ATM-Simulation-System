package com.atm;

public class User {
	private String cardNumber;
	private int pin;
	private Account account;

	public User(String cardNumber, int pin, double initialBalance) {
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.account = new Account(initialBalance);
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public boolean verifyPin(int enteredPin) {
		return this.pin == enteredPin;
	}

	public Account getAccount() {
		return account;
	}
}

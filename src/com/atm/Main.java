package com.atm;

public class Main {
	public static void main(String[] args) {
		// Create a sample user
		User user = new User("1234-5678-9012", 1234, 1000.0);

		// Start ATM session
		ATM atm = new ATM();
		atm.start(user);
	}
}

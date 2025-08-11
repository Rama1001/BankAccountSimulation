package com.bank;

import java.util.ArrayList;

public class Account {

	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private ArrayList<String> transactionHistory;

	public Account(String accountNumber, String accountHolderName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
		this.transactionHistory = new ArrayList<>();
		transactionHistory.add("Account created with balance: " + initialBalance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			transactionHistory.add("Deposited: " + amount + " | Balance: " + balance);
			System.out.println("Deposit successful.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			transactionHistory.add("Withdrew: " + amount + " | Balance: " + balance);
			System.out.println("Withdrawal successful.");
		} else if (amount > balance) {
			System.out.println("Insufficient funds.");
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	public void viewTransactionHistory() {
		System.out.println("=== Transaction History ===");
		for (String record : transactionHistory) {
			System.out.println(record);
		}
	}
}

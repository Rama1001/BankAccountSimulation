package com.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create account
		System.out.print("Enter Account Number: ");
		String accountNumber = sc.nextLine();
		System.out.print("Enter Account Holder Name: ");
		String holderName = sc.nextLine();
		System.out.print("Enter Initial Balance: ");
		double initialBalance = sc.nextDouble();

		Account account = new Account(accountNumber, holderName, initialBalance);

		int choice;
		do {
			System.out.println("\n=== Bank Menu ===");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. View Balance");
			System.out.println("4. View Transaction History");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter amount to deposit: ");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;

			case 3:
				System.out.println("Current Balance: " + account.getBalance());
				break;

			case 4:
				account.viewTransactionHistory();
				break;

			case 5:
				System.out.println("Thank you for using our bank system.");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 5);

		sc.close();
	}

}

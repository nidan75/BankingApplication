package com.bank;

public class BankAccount {
	
	    private String accountHolder;
	    private int accountNumber;
	    private double balance;

	    // Constructor
	    public BankAccount(String accountHolder, int accountNumber, double balance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Deposit Method
	    public void deposit(double amount) {
	        if(amount > 0) {
	            balance += amount;
	            System.out.println("Amount Deposited Successfully");
	        }
	    }

	    // Withdraw Method
	    public void withdraw(double amount) {
	        if(amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal Successful");
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    // Display Balance
	    public void displayBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

	    // Display Account Details
	    public void displayAccountDetails() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	}

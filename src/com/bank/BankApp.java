package com.bank;

import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.println("===== BANKING APPLICATION =====");

		        System.out.print("Enter Account Holder Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Account Number: ");
		        int accNo = sc.nextInt();

		        System.out.print("Enter Initial Balance: ");
		        double balance = sc.nextDouble();

		        BankAccount account = new BankAccount(name, accNo, balance);

		        int choice;

		        do {
		            System.out.println("\n===== MENU =====");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Check Balance");
		            System.out.println("4. Account Details");
		            System.out.println("5. Exit");

		            System.out.print("Enter Your Choice: ");
		            choice = sc.nextInt();

		            switch(choice) {

		                case 1:
		                    System.out.print("Enter Deposit Amount: ");
		                    double depositAmount = sc.nextDouble();
		                    account.deposit(depositAmount);
		                    break;

		                case 2:
		                    System.out.print("Enter Withdraw Amount: ");
		                    double withdrawAmount = sc.nextDouble();
		                    account.withdraw(withdrawAmount);
		                    break;

		                case 3:
		                    account.displayBalance();
		                    break;

		                case 4:
		                    account.displayAccountDetails();
		                    break;

		                case 5:
		                    System.out.println("Thank You For Using Banking App");
		                    break;

		                default:
		                    System.out.println("Invalid Choice");
		            }

		        } while(choice != 5);

		        sc.close();
		    }
		}

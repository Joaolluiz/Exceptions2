package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter the account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter the amount for withdraw: ");
			double amount = sc.nextDouble();
			
			try {
				acc.withdraw(amount);
				System.out.print("New Balance: " + String.format("%.2f", acc.getBalance()));
			}
		
			catch (IllegalArgumentException e){
				System.out.println("Withdraw error: " + e.getMessage());
			}
			catch (RuntimeException e) {
				System.out.println("Unexpected error");
			}
		
			sc.close();
	}

}
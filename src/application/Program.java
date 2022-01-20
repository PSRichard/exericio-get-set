package application;

import java.util.Locale;
import java.util.Scanner;
import entities.account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na inicial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new account(number, holder, initialDeposit);			
		}
		else {
			account = new account(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println();
		
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println();
		System.out.println("Update account data: ");
		System.out.println(account);
		
		sc.close();
	}

}

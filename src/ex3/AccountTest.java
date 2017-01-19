package ex3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account("Shruti", 50.00);
		Account account2 = new Account("Bab", 5.00);
		
		System.out.printf("%s balance: %2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %2f%n", account2.getName(), account2.getBalance());
		
		
		//Scanner object to get user input
		Scanner input = new Scanner(System.in);
		
		//Account 1
		//Prompt the user to enter amount
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nAdding %2f to account1 balance%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance is: %2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: %2f%n", account2.getName(), account2.getBalance());
		
		//Account 2
				//Prompt the user to enter amount
				System.out.print("Enter deposit amount for account2: ");
				depositAmount = input.nextDouble();
				System.out.printf("%nAdding %2f to account2 balance%n", depositAmount);
				account1.deposit(depositAmount);

				System.out.printf("%s balance is: %2f%n", account2.getName(), account2.getBalance());
				System.out.printf("%s balance is : %2f%n", account2.getName(), account2.getBalance());
	}

}

package application;

import java.util.Scanner;

import entities.Bancario;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bancario banco;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account houder: ");
		String name = sc.nextLine();
		System.out.print("Is there initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double quantity = sc.nextDouble();
			banco = new Bancario(number,name,quantity);
		}else {
			banco = new Bancario (number,name);
		}
		
		System.out.println("\nAccount date: ");
		System.out.println(banco);
		
		System.out.print("\nEnter a deposit value: ");
		banco.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(banco);
		
		System.out.print("\nEnter a withdraw value: ");
		banco.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(banco);
		
		
		sc.close();
	}

}

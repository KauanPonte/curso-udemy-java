package application;

import java.util.Scanner;

import entities.conversorDolar;

public class dolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.printf("What is the dollar price? ");
		double valorDola = sc.nextDouble();
		
		System.out.printf("how many dollars will be bought? ");
		double dolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f ",conversorDolar.conversor(valorDola, dolar));
		
		
		
		sc.close();

	}

}

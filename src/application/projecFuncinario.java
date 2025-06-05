package application;

import java.util.Scanner;

import entities.funcionario;

public class projecFuncinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		funcionario Funcionario = new funcionario();
		
		System.out.printf("Name: ");
		Funcionario.name = sc.nextLine();
		
		System.out.printf("Gross salary: ");
		Funcionario.salarioBruto = sc.nextDouble();
		
		System.out.printf("Tax: ");
		Funcionario.imposto =sc.nextDouble();
		
		System.out.println("\nEmployee: " + Funcionario);
		
		System.out.printf("\nWhich percenage to increase salary? ");
		Funcionario.taxaSalario(sc.nextDouble());
		
		
		System.out.println("\nUpdated data: " + Funcionario);
		
		
		
		
		sc.close();

	}

}

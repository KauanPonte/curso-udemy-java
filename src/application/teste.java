package application;

import java.util.Scanner;

import entities.ExProp;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		ExProp[] vect = new ExProp[n]; 
		
		for (int i =0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa:\n",i+1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new ExProp(name, idade, altura);
			
		}
		
		double soma = 0;
		for (int i =0; i < vect.length; i++) {
			soma += vect[i].getHeight();			
		}
		
		double media = soma / vect.length;
		System.out.printf("\nAltura media: %.2f", media);
		
		
		int contagem = 0; 
		for (int i =0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				contagem += 1 ;
			}
		}
		
		double porcentagem = contagem * 100 / vect.length;
		System.out.printf("\nPessoas com menos de 16 anos: %.2f%% \n", porcentagem); 
		for (int i =0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}		
				
				
		sc.close();

	}

}

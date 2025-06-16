package application;

import java.util.Scanner;

import entities.Circulo;



public class circulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter radius: ");
		double raio = sc.nextDouble();
		
		System.out.printf("Circunferencia: %.2f \n", Circulo.circunferencia(raio));
		System.out.printf("Volume: %.2f \n", Circulo.volume(raio));
		System.out.printf("PI: %.2f", Circulo.PI);
		
		
		
		
		
		sc.close();
	}

}

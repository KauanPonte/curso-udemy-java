package application;

import java.util.Scanner;

import entities.exPt2;

public class vertorPt2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		exPt2[] vect = new exPt2[n]; 
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double prace = sc.nextDouble();
			vect[i] = new exPt2(name, prace);
			}
		
		double soma = 0;
		for (int i= 0; i<vect.length; i++) {
			soma += vect[i].getPrace();
		}
		
		double med = soma / vect.length;
		
		System.out.printf("\nAVERAGE PRICE = %.2f", med );
		
		
		
		
		
		
		sc.close();

	}

}

package application;

import java.util.Scanner;

import entities.ExercicioProduct;

public class exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ExercicioProduct Product = new ExercicioProduct();
		
		System.out.println("Enter product data: ");
		
		System.out.printf("Name: ");
		Product.name = sc.nextLine();
		
		System.out.printf("Price: ");
		Product.price = sc.nextDouble();
		
		System.out.printf("Quantity in stock: ");
		Product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + Product);
	
		System.out.printf("\nEnter the number of products to be added in stock: ");
		Product.addProducts(sc.nextInt());
		
		System.out.println("\nUpdated data: " + Product);
		
		System.out.printf("\nEnter the number of products to be removed from stock: ");
		Product.removeProcucts(sc.nextInt());
		
		System.out.println("\nUpdated data: " + Product);
		
		sc.close();

	}

}

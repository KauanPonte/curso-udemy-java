package application;

import java.util.Scanner;


import entities.Hotel;

public class projecHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hotel[] hotel = new Hotel[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		int room = 0;
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			System.out.println("\nRent #" + i + ":");
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			
			hotel[room] = new Hotel(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		
		
		for (int i=0; i<hotel.length; i++) {
			if ( hotel[i] != null) {
				System.out.println(i + ": " + hotel[i]);
			}
		}
		
		
		sc.close();

	}

}

package application;

import java.util.Scanner;

import entities.retangolo;

public class projectRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		retangolo Retangulo = new retangolo();
		
		System.out.println("Enter rectangle whidth and height");
		Retangulo.largura = sc.nextDouble();
		Retangulo.altura = sc.nextDouble();
		
		System.out.println(Retangulo);
		
		
		sc.close();

	}

}

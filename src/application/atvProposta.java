package application;

import java.util.Scanner;

public class atvProposta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o numero de linhas da matriz: ");
		int n = sc.nextInt();
		System.out.print("Digite o numero de colunas da matriz ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um numero da matriz: ");
		int num = sc.nextInt();
		
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length; j++) {
				if (num == mat[i][j]){
					System.out.println("\nPosition " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < m-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i < n-1) {
						System.out.println("Up: " + mat[i+1][j]);
					}
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

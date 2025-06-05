package application;

import java.util.Scanner;

import entities.aluno;

public class projecAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		aluno Aluno = new aluno();
		
		System.out.println("Enter the student's name and the trimester grades: ");
		Aluno.name = sc.nextLine();
		Aluno.n1 = sc.nextDouble();
		Aluno.n2 = sc.nextDouble();
		Aluno.n3 = sc.nextDouble();
		
		if ( Aluno.notaFinal() >= 60 && Aluno.notaFinal() <= 100) {
			System.out.println(Aluno);
			System.out.println("PASS");
		}
		else if(Aluno.notaFinal() >= 0 && Aluno.notaFinal() <= 59) {
			System.out.println(Aluno);
			System.out.println("FAILED");
			System.out.println("MISSING " + Aluno.faltaPassar() + " POINTS");
		}else {
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

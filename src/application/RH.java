package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;

public class RH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Funcionarios> list = new ArrayList<>();
		
		for (int i= 0 ; i<n;i++) {
			System.out.println("\nEmplyoee #" + (i+1));
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id,name,salario);
			
			list.add(func);

		}
		
		System.out.print("\nEnter the employee id that will have salary increase : ");
		Integer ID = sc.nextInt();
		Integer pos = Position(list, ID);
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			list.get(pos).almetoSalario(sc.nextInt());
		}
		
		System.out.println("\nList of employees: ");
		for (Funcionarios x : list) {
			System.out.println(x);
		}
		
		
	
		
		sc.close();

	}
	
	
	public static Integer Position(List<Funcionarios> list, int id ) {
		for (int i = 0; i < list.size(); i++ ) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
	
	
	
	

}

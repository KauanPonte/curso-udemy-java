package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		list.add("Mariana");
		list.add("Mauan");
		list.add("Alex");
		list.add("Bian");
		list.add(2, "Bob");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------------");

		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------------");

		System.out.println("Bob esta na posicao: " + list.indexOf("Bob"));
		System.out.println("Bob esta na posicao: " + list.indexOf("Rina"));
		
		System.out.println("----------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
		
		sc.close();

	}

}

package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Xa, Xb, Xc, Ya, Yb, Yc;
		
		System.out.println("Entre com as mendidas do triangulo X: ");
		Xa = sc.nextDouble();
		Xb = sc.nextDouble();
		Xc = sc.nextDouble();
		
		System.out.println("Entre com as mendidas do triangulo Y: ");
		Ya = sc.nextDouble();
		Yb = sc.nextDouble();
		Yc = sc.nextDouble();
		
		double p = ( Xa + Xb + Xc ) / 2;
		double areaX = Math.sqrt(p*(p-Xa)*(p-Xb)*(p-Xc));
		
		p = ( Ya + Yb + Yc ) / 2;
		double areaY = Math.sqrt(p*(p-Ya)*(p-Yb)*(p-Yc));
		
		System.out.printf("Area do triangulo X: %.4f \n", areaX );
		System.out.printf("Area do triangulo Y: %.4f \n", areaY );
		
		if (areaX > areaY) {
			System.out.println("A maior area é X");
		}else {
			System.out.println("A maior area é Y");
		}
		
		
		sc.close();

	}

}

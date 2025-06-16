package entities;

public class conversorDolar {

	public static final double IOF = 0.06;
	
	
	public static double conversor(double valorDolar , double dolar) {
		return valorDolar * dolar + (valorDolar * dolar * IOF);
	}
	
}

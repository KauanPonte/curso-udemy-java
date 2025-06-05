package entities;

public class retangolo {
	
	public double largura;
	public double altura;

	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt((largura * largura) + (altura * altura));
	}
	
	public String toString() {
		return "AREA = "
			    + String.format("%.2f", area())
				+ "\nPERIMETRO = "
				+ String.format("%.2f", perimetro())
				+ "\nDIAGONA = "
				+ String.format("%.2f", diagonal());
	}
}
	
	
	

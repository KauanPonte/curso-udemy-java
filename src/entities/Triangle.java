package entities;

public class Triangle {
	
	public Double a;
	public Double b;
	public Double c;
	
	public double area() {
		 double p = (a + b + c ) / 2;
		 return Math.sqrt(p * (a - p) * p * (b - p) * p * (c-p));
	}
	

}

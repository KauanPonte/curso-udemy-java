package entities;

public class aluno {
	
	public String name;
	public double n1,n2,n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public double faltaPassar() {
		return 60 - notaFinal();
	}
	
	public String toString() {
		return "\nFINAL GRADE = "
				+ String.format("%.2f", notaFinal()); 
	}

}

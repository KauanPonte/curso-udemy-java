package entities;

public class funcionario {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void taxaSalario(double taxa) {
		salarioBruto += salarioBruto * taxa/100 ; 
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", salarioLiquido());
	}
}

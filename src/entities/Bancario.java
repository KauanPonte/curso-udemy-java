package entities;

public class Bancario {

	private int number;
	private String name;
	private double quantity;

	public Bancario() {

	}
	
	public Bancario(int number, String name, double initialDeposit) {

		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public Bancario(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}
	
	public void deposit(double quantity) {
		this.quantity += quantity;
	}

	public void withdraw (double quantity) {
		this.quantity -= quantity + 5 ;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + quantity     ;
	}
	

}

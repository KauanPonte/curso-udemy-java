package entities;

public class ExercicioProduct {
	
	public String name;
	public double price;
	public int quantity;  
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int add) {
	    quantity += add;
	}
	
	public void removeProcucts(int remove) {
		quantity -= remove;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}

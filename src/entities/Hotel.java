package entities;

public class Hotel {
	
	
	private String name;
	private String email;
	

	public Hotel() {
	}
	
	public Hotel(String name, String emal) {
		this.name = name;
		this.email = emal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmal() {
		return email;
	}

	public void setEmal(String emal) {
		this.email = emal;
	}
	
	public String toString() {
		return name + ", " + email;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

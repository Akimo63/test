package _1;

public class CerdoPrasa extends AnimalesZvirat{

	
	private String color;
	
	
	public CerdoPrasa() {
		super();
	}

	public CerdoPrasa(String nombre, double peso, int edad, String color) {
		super(nombre, peso, edad);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
	
}

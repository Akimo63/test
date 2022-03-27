package _1;
import java.util.Scanner;
public class CerdoPrasa extends AnimalesZvirat{

	
	private String color;
	Scanner sc = new Scanner (System.in);
	Scanner sci = new Scanner (System.in);
	
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

	public void crearCerdo() {
		System.out.println("Nombre: ");
		String name = sc.nextLine();
		System.out.println("Introduce el peso: ");
		double peso = sci.nextDouble();
		System.out.println("Edad: ");
		int edad = sci.nextInt();
		
		System.out.println("");
		System.out.println("Nombre: " + name + " peso: " + peso + " edad: " + edad);
		
		
	}
	
	
}

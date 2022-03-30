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
		 super.setNombre(sc.nextLine());
		System.out.println("Introduce el peso: ");
		 super.setPeso(sci.nextDouble()); 
		System.out.println("Edad: ");
		super.setEdad(sci.nextInt()); 
		System.out.println("Color: ");
		this.setColor(sc.nextLine());
		
		System.out.println("Creado: " + super.getNombre());
		
		
	}
	
	
}
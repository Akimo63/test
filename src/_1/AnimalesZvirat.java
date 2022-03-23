package _1;

import java.util.Scanner;

public class AnimalesZvirat {

	private String nombre;
	private double peso;
	private int edad;
	Scanner sc = new Scanner(System.in);
	
	public AnimalesZvirat() {
		super();
	}
	public AnimalesZvirat(String nombre, double peso, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public void pedirDatos() {
		
		System.out.println(this.getNombre() + " :  peso:" + this.getPeso() + "kg, edad: " + this.getEdad() + " anyo/rok");
		
		
	}
	
	public int sumarEdad() {
		
		this.edad += 1;
		return this.edad;
		
	}
	public void sumarPeso() {
		System.out.println("Nuevo peso?");
		double sumpeso = sc.nextInt();
		System.out.println(sumpeso + " kg");
		double pesoviejo = this.peso;
		this.peso = sumpeso;
		double pesorest = sumpeso - pesoviejo;
		System.out.println(this.nombre + " ha ganado " + pesorest + " kg");
		

		
	}
	
}

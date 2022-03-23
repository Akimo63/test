package _1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		VacaKrava vaca1 = new VacaKrava("Romero", 230.5, 3, "leche");
		VacaKrava vaca2 = new VacaKrava("Facundo", 205.2, 3, "carne");
		VacaKrava vaca3 = new VacaKrava("Fina", 245.4, 3, "leche");

		CerdoPrasa cerdo1 = new CerdoPrasa("Petro", 90.2, 2, "rosado");

		OvejaOvce oveja1 = new OvejaOvce("Mota", 40, 3, "rizado");
		OvejaOvce oveja2 = new OvejaOvce("Coral", 50, 4, "liso");
		OvejaOvce oveja3 = new OvejaOvce("Cebra", 37.6, 1, "rizado");

		AnimalesZvirat animales[] = { vaca1, vaca2, vaca3, cerdo1, oveja1, oveja2, oveja3 };

		Scanner sc = new Scanner(System.in);
		Scanner scl = new Scanner(System.in);

		boolean konec = false;
		while (!konec) {
			Menu();
			int menuop = sc.nextInt();
			int nameani = 0;
			switch (menuop) {
			case 1:
				System.out.println("LISTADO DE ANIMAL");
				for (int i = 0; i < animales.length; i++) {
					animales[i].pedirDatos();
				}
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 2:
				System.out.println("MOSTRAR TIPO DE ANIMAL");
				for (int i = 0; i < animales.length; i++) {
					System.out.println((i + 1) + ".- " + animales[i].getNombre());
				}
				System.out.println("Elija el animal");
				nameani = sc.nextInt() - 1;

				if (animales[nameani] instanceof VacaKrava) {
					System.out.println(animales[nameani].getNombre() + " es vaca");
				} else if (animales[nameani] instanceof CerdoPrasa) {
					System.out.println(animales[nameani].getNombre() + " es cerdo");
				} else if (animales[nameani] instanceof OvejaOvce) {
					System.out.println(animales[nameani].getNombre() + " es oveja");
				}
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 3:
				System.out.println("SUMAR ANYO A ANIMAL");
				for (int i = 0; i < animales.length; i++) {
					System.out.println((i + 1) + ".- " + animales[i].getNombre()+ " edad: " + animales[i].getEdad());
				}
				System.out.println("Elija el animal");
				nameani = sc.nextInt() - 1;
				if (animales[nameani] instanceof VacaKrava) {
					System.out.println(animales[nameani].getNombre() + " ahora tiene " + animales[nameani].sumarEdad() + " anyo/rok");
				} else if (animales[nameani] instanceof CerdoPrasa) {
					System.out.println(animales[nameani].getNombre() + " ahora tiene " + animales[nameani].sumarEdad() + " anyo/rok");
				} else if (animales[nameani] instanceof OvejaOvce) {
					System.out.println(animales[nameani].getNombre() + " ahora tiene " + animales[nameani].sumarEdad() + " anyo/rok");
				}
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 4:
				System.out.println("CAMBIAR PESO A ANIMAL");
				for (int i = 0; i < animales.length; i++) {
					System.out.println((i + 1) + ".- " + animales[i].getNombre()+ " peso: " + animales[i].getPeso() + " kg");
				}
				System.out.println("Elija el animal");
				nameani = sc.nextInt() - 1;
				if (animales[nameani] instanceof VacaKrava) {
					animales[nameani].sumarPeso();
				} else if (animales[nameani] instanceof CerdoPrasa) {
					animales[nameani].sumarPeso();
				} else if (animales[nameani] instanceof OvejaOvce) {
					animales[nameani].sumarPeso();
				}
				
				
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 5:
				System.out.println("MARCAR ANIMAL COMO MUERTO");
				
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 6:
				System.out.println("ADQUIRIR NUEVO CERDO/PRASA");
				
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 7:
				System.out.println("LISTADO DE ANIMALES COMPLETO");
				for (int i = 0; i < animales.length; i++) {
					if (animales[i] instanceof VacaKrava) {
						VacaKrava krava = (VacaKrava) animales[i];
						System.out.println("vaca: " + animales[i].getNombre() + " " + animales[i].getPeso() + " " + animales[i].getEdad() + "anyos/let   uso: " + krava.getUso());
					} else if (animales[i] instanceof CerdoPrasa) {
						CerdoPrasa prasa = (CerdoPrasa) animales[i];
						System.out.println("cerdo: " + animales[i].getNombre() + " " + animales[i].getPeso() + " " + animales[i].getEdad() + "anyos/let   color piel: " + prasa.getColor());
					} else if (animales[i] instanceof OvejaOvce) {
						OvejaOvce ovce = (OvejaOvce) animales[i];
						System.out.println("oveja: " + animales[i].getNombre() + " " + animales[i].getPeso() + " " + animales[i].getEdad() + "anyos/let   tipo de pelo: " + ovce.getPelo());
					}
				}
				
				
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			}

		}

	}

	private static void Menu() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1.- Listado de animales");
		System.out.println("2.- Mostrar tipo de animal");
		System.out.println("3.- Sumar anyo a un animal");
		System.out.println("4.- Cambiar peso animal");
		System.out.println("5.- Marcar animal como muerto");
		System.out.println("6.- Adquirir nuevo cerdo");
		System.out.println("7.- Listado de animales completo");
		System.out.println("8.- Obtencion de leche");
		System.out.println("9.- Venta de leche");
	}

}

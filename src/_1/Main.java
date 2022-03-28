package _1;

import java.util.Scanner;
import java.util.Random;

public class Main {

	private static final double preciolitro = 0.5;

	public static void main(String[] args) {

		VacaKrava vaca1 = new VacaKrava("Romero", 230.5, 3, "leche");
		VacaKrava vaca2 = new VacaKrava("Facundo", 205.2, 3, "carne");
		VacaKrava vaca3 = new VacaKrava("Fina", 245.4, 3, "leche");

		CerdoPrasa cerdo1 = new CerdoPrasa("Petro", 90.2, 2, "rosado");

		OvejaOvce oveja1 = new OvejaOvce("Mota", 40, 3, "rizado");
		OvejaOvce oveja2 = new OvejaOvce("Coral", 50, 4, "liso");
		OvejaOvce oveja3 = new OvejaOvce("Cebra", 37.6, 1, "rizado");

		CerdoPrasa cerdo[] = { cerdo1 };
		VacaKrava vaca[] = { vaca1, vaca2, vaca3 };
		OvejaOvce oveja[] = { oveja1, oveja2, oveja3 };
		AnimalesZvirat animales[] = { vaca1, vaca2, vaca3, cerdo1, oveja1, oveja2, oveja3 };

		Scanner sc = new Scanner(System.in);
		Scanner scl = new Scanner(System.in);
		Random r = new Random();

		double suma = 0;
		double lechetot = 0;
		double ventot = 0;
		double venfin = 0;
		double venlech = 0;

		boolean konec = false;
		while (!konec) {
			Menu();
			int menuop = sc.nextInt();
			int nameani = 0;
			switch (menuop) {
			case 1:
				System.out.println("LISTADO DE ANIMAL");
				for (int i = 0; i < animales.length; i++) {
					if (animales[i] != null) {
						animales[i].pedirDatos();
					}
				}
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 2:
				System.out.println("MOSTRAR TIPO DE ANIMAL");
				for (int i = 0; i < animales.length; i++) {
					if (animales[i] != null) {
						System.out.println((i + 1) + ".- " + animales[i].getNombre());
					}
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
					if (animales[i] != null) {
						System.out
								.println((i + 1) + ".- " + animales[i].getNombre() + " edad: " + animales[i].getEdad());
					}
				}
				System.out.println("Elija el animal");
				nameani = sc.nextInt() - 1;
				if (animales[nameani] instanceof VacaKrava) {
					System.out.println(animales[nameani].getNombre() + " ahora tiene " + animales[nameani].sumarEdad()
							+ " anyo/rok");
				} else if (animales[nameani] instanceof CerdoPrasa) {
					System.out.println(animales[nameani].getNombre() + " ahora tiene " + animales[nameani].sumarEdad()
							+ " anyo/rok");
				} else if (animales[nameani] instanceof OvejaOvce) {
					System.out.println(animales[nameani].getNombre() + " ahora tiene " + animales[nameani].sumarEdad()
							+ " anyo/rok");
				}
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 4:
				System.out.println("CAMBIAR PESO A ANIMAL");
				for (int i = 0; i < animales.length; i++) {
					if (animales[i] != null) {
						System.out.println(
								(i + 1) + ".- " + animales[i].getNombre() + " peso: " + animales[i].getPeso() + " kg");
					}
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
				for (int i = 0; i < animales.length; i++) {
					if (animales[i] != null) {
						System.out.println((i + 1) + ".- " + animales[i].getNombre());
					}
				}
				System.out.println("Elija el animal");
				nameani = sc.nextInt() - 1;
				if (animales[nameani] != null) {
					System.out.println("El animal " + animales[nameani].getNombre() + " ha muerto");
					if (animales[nameani] instanceof VacaKrava) {
						for (int i = 0; i < vaca.length; i++) {
							if (vaca[i].getNombre().equals(animales[nameani].getNombre())) {
								vaca[i] = null;
								i = vaca.length;
							}
						}
						animales[nameani] = null;
					} else if (animales[nameani] instanceof CerdoPrasa) {
						System.out.println("El animal " + animales[nameani].getNombre() + " ha muerto");
						for (int i = 0; i < cerdo.length; i++) {
							if (cerdo[i].getNombre().equals(animales[nameani].getNombre())) {
								cerdo[i] = null;
								i = cerdo.length;
							}
						}
						animales[nameani] = null;
					} else if (animales[nameani] instanceof OvejaOvce) {
						System.out.println("El animal " + animales[nameani].getNombre() + " ha muerto");
						for (int i = 0; i < oveja.length; i++) {
							if (oveja[i].getNombre().equals(animales[nameani].getNombre())) {
								oveja[i] = null;
								i = oveja.length;
							}
						}
						animales[nameani] = null;
					}

				}
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 6:
				System.out.println("ADQUIRIR NUEVO CERDO/PRASA");
				for (int i = 0; i < cerdo.length; i++) {
					if (cerdo[i] != null) {

						System.out.println("Ya existe un cerdo");

					} else {
						cerdo1.crearCerdo();
						cerdo[i] = cerdo1;
						for (int j = 0; j < animales.length; j++) {
							if(animales[j] == null) {
								animales[j] = cerdo1;
							}
						}
					}
				}
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 7:
				System.out.println("LISTADO DE ANIMALES COMPLETO");
				for (int i = 0; i < animales.length; i++) {
					if (animales[i] != null) {
						if (animales[i] instanceof VacaKrava) {
							VacaKrava krava = (VacaKrava) animales[i];
							System.out.println("vaca: " + animales[i].getNombre() + " " + animales[i].getPeso() + " "
									+ animales[i].getEdad() + "anyos/let   uso: " + krava.getUso());
						} else if (animales[i] instanceof CerdoPrasa) {
							CerdoPrasa prasa = (CerdoPrasa) animales[i];
							System.out.println("cerdo: " + animales[i].getNombre() + " " + animales[i].getPeso() + " "
									+ animales[i].getEdad() + "anyos/let   color piel: " + prasa.getColor());
						} else if (animales[i] instanceof OvejaOvce) {
							OvejaOvce ovce = (OvejaOvce) animales[i];
							System.out.println("oveja: " + animales[i].getNombre() + " " + animales[i].getPeso() + " "
									+ animales[i].getEdad() + "anyos/let   tipo de pelo: " + ovce.getPelo());
						}
					}
				}

				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;
			case 8:
				System.out.println("OBTENCIO DE LECHE");
				for (int i = 0; i < vaca.length; i++) {

					if ((vaca[i] != null && vaca[i].getUso().equals("leche"))) {

						double leche = r.nextInt(4) + 3;
						double lech = r.nextDouble();
						suma = leche + lech;
						suma = Math.round(suma * 10.0) / 10.0;
						System.out.println("Leche obtenida por " + vaca[i].getNombre() + " " + suma);
						lechetot = lechetot + suma;
					}

				}
				lechetot = Math.round(lechetot * 10.0) / 10.0;
				System.out.println(lechetot);
				System.out.println("Pulse intro para volver al MENU PRINCIPAL");
				scl.nextLine();
				break;

			case 9:
				String userEntry = "";
				System.out.println("Leche en stock: " + Math.round(lechetot * 10.0) / 10.0);

				if (lechetot > 0.0) {

					while (!isNumeric(userEntry) || venlech > lechetot) {
						System.out.println("Cuanta se quiere vender? ");
						userEntry = sc.nextLine();
						if (isNumeric(userEntry)) {
							venlech = Double.parseDouble(userEntry);
						} 
					}
					System.out.println(venlech + "L");
					lechetot = lechetot - venlech;
					ventot = venlech * preciolitro;
					System.out.println("Ganancias por esta venta: " + ventot + "euros");
				} else {
					System.out.println("No hay leche para vender");
				}

				venfin = venfin + ventot;
				System.out.println("Ganancias acumuladas: " + venfin + "euros");
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
	public static boolean isNumeric (String str) {
		try {
			Double.parseDouble(str);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	

}

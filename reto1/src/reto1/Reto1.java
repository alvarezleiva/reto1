package reto1;

import java.util.Scanner;
import reto1.Reto1Funciones;
import reto1.Reto1Funciones2;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			// Funcion imprimir para poner lineas por consola
			Reto1Funciones2.imprimir("-", 100);
			System.out.println("Elige la operacion");
			Reto1Funciones2.imprimir("-", 100);
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			// Validacion del numero introducido
			do {
				try {
					String s = sc.nextLine();
					n = Integer.parseInt(s);
					break;
				} catch (Exception e) {
					System.out.println("Formato incorrecto");
				}
			} while (true);

			// Función sumar

			double num1 = 0;
			double num2 = 0;
			do {
				try {

					System.out.println("Introduce un número");

					String s = sc.nextLine();
					num1 = Integer.parseInt(s);

					if (n >= 1 && n <= 4) {
						System.out.println("Introduce otro número");
						s = sc.nextLine();
						num2 = Integer.parseInt(s);
						break;
					}
					break;

				} catch (Exception e) {
					System.out.println("Formato incorrecto");
				}

			} while (true);

			if( n == 0) {
				break;
			}
			else if (n == 1) {
				double resultado = Reto1Funciones2.sumar(num1, num2);
				System.out.println("Resultado de la suma " + resultado);
			}

			else if (n == 2) {
				double resultado = Reto1Funciones2.restar(num1, num2);
				System.out.println("Resultado de la resta " + resultado);
			}

			else if (n == 3) {
				double resultado = Reto1Funciones.multiplicar(num1, num2);
				System.out.println("Resultado de la multiplicación " + resultado);
			}

			else if (n == 4) {
				double resultado = Reto1Funciones.dividir(num1, num2);
				System.out.println("Resultado de la división " + resultado);
			}

			else if (n == 5) {
				boolean par = Reto1Funciones2.esPar(num1);
				if (par) {
					System.out.println(num1 + " es par");

				} else {
					System.out.println(num1 + " no es par");
				}

			} else if (n == 6) {
				boolean impar = Reto1Funciones2.esImpar(num1);
				if (impar) {
					System.out.println(num1 + " es impar");
				} else {
					System.out.println(num1 + " es número par");
				}
			}
			else if( n == 7) {
				boolean positivo = Reto1Funciones.esPositivo(num1);
				if(positivo) {
					System.out.println(num1 + "es positivo");
				} else {
					System.out.println(num1 + " no es positivo");
				}
			}

		} while (!(n >= 0 && n < 9));
	}

}

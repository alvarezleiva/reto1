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
			
			double num1;
			double num2;
			do {
				try {
					System.out.println("Introduce dos números");
					
					String s = sc.nextLine();
					num1 = Integer.parseInt(s);
					
					s = sc.nextLine();
					num2 = Integer.parseInt(s);
					break;
					

				} catch (Exception e) {
					System.out.println("Formato incorrecto");
				}

			} while (true);
			
			if(n == 1) {
				double resultado = Reto1Funciones2.sumar(num1, num2);
				System.out.println("Resultado de la suma " + resultado );
			}
			
			if (n == 2) {
				double resultado = Reto1Funciones2.restar(num1, num2);
				System.out.println("Resultado de la resta " + resultado);
			}
			
			if (n == 3) {
				double resultado = Reto1Funciones.multiplicar(num1, num2);
				System.out.println("Resultado de la multiplicación " + resultado);
			}
			
			if (n == 4) {
				double resultado = Reto1Funciones.dividir(num1, num2);
				System.out.println("Resultado de la división " + resultado);
			}
			
			if (n == 5) {
				
			}

		} while (!(n >= 0 && n < 9));
	}

}

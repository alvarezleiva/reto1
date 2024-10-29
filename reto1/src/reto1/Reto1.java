package reto1;

import java.util.Scanner;
import reto1.Reto1Funciones;
import reto1.Reto1Funciones2;
public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		do {
			//Funcion imprimir para poner lineas por consola
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
					num1 = Integer.parseInt(s);
					break;
				} catch (Exception e) {
					System.out.println("Formato incorrecto");
				}
			}while(true);
		}while(!(num1>=0 && num1<9));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

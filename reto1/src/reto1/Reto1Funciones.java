package reto1;

public class Reto1Funciones {

	public static double multiplicar(int a, int b) {

		int multi = a * b;
		return multi;

	}

	public static double dividir(int a, int b) {

		int divide = a / b;
		if(a == 0 || b == 0) {
			System.out.println("No puede ser 0");
		}
		return divide;

	}

	public static boolean esPositivo(double positivo) {

		if (positivo > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean esNegativo(double negativo) {

		if (negativo < 0) {
			return true;
		} else {
			return false;
		}

	}

}

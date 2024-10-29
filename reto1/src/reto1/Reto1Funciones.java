package reto1;

public class Reto1Funciones {

	public static double multiplicar(double a, double b) {

		double multi = a * b;
		return multi;

	}

	public static double dividir(double a, double b) {

		double divide = a / b;
		if(a == 0 || b == 0) {
			return 0;
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

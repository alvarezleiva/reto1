package reto1;

public class Reto1Funciones2 {
	public static double sumar(double num1,double num2) {
		return num1+num2;
	}
	public static double  restar(double num1,double num2) {
		return num1-num2;
	}
	public static boolean esPar(double num1) {
		if(num1%2==0)
			return true;
		return false;
	}
	public static boolean esImpar(double num1) {
		if(!(num1%2==0))
			return true;
		return false;
	}
	public static void imprimir(String s, int num1) {
		for (int i = 0; i <num1; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
}

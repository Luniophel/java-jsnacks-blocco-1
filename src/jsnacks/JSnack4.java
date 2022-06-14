package jsnacks;

public class JSnack4 {
	/*
	 * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono
	 * in posizione dispari
	 */

	public static void main(String[] args) {

		// le posizioni corrispondono all'indice, l'array parte dalla posizione 0
		int[] numbers = { 4, 6, 9, 22, 42, 67, 15, 21, 64, 23, 7, 1 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) {
				sum += numbers[i];
				System.out.println("somma fino alla posizione " + i + ": " + sum);
			}

		}

	}

}

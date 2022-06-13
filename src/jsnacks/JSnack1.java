package jsnacks;

import java.util.Scanner;

public class JSnack1 {
	/*
	 * Il software deve chiedere per 5 volte all’utente di inserire un numero.
	 * Il programma stampa la somma di tutti i numeri inseriti.
	 * Esegui questo programma in due versioni, con il for e con il while.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int[] numbers;
		numbers = new int[5];

//		VERSIONE FOR		
//		for (int i = 0; i < 5; i++) {
//			System.out.print("Inserisci il " + (i+1) + "° numero: ");
//			int input = scan.nextInt();
//			numbers[i] = input;
//			sum = sum + input;
//		}
		
//		VERSIONE WHILE
		int counter = 0;
		while (counter < 5) {
			System.out.print("Inserisci il " + (counter+1) + "° numero: ");
			int input = scan.nextInt();
			numbers[counter] = input;
			sum = sum + input;
			counter++;
		}
		
		System.out.println("Hai scelto i numeri: " + numbers[0] + "; " + numbers[1] + "; " + numbers[2] + "; " + numbers[3] + "; " + numbers[4] + "; " );
		System.out.println("La loro somma è: " + sum);
		
		scan.close();
	}

}

package jsnacks;

import java.util.Scanner;

public class JSnack2 {
	/*
	 *	Chiedi all'utente di inserire un numero, se � pari stampa il numero,
	 *	se � dispari stampa il numero successivo
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " � pari.");
		} else {
			System.out.println("il numero successivo di " + num + " � " + (num + 1) + ".");
		}
		
		scan.close();
	}

}

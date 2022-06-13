package jsnacks;

import java.util.Scanner;

public class JSnack5 {
	/*
	 * 	La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
	 *	di posizioni nelle quali i caratteri corrispondenti sono diversi.
	 *	Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Scrivi due parole:");
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		
		char[] ArWord1 = word1.toCharArray();
		char[] ArWord2 = word2.toCharArray();

		int hamming = 0;

		for(int i=0; i < ArWord1.length; i++) {
			if(ArWord1[i] != ArWord2[i]) {
				hamming++;
			}
		}
		
		System.out.println("La distanza di Hamming è: " + hamming);
		
		scan.close();
	}

}

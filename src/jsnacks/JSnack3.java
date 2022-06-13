package jsnacks;

import java.util.Random;

public class JSnack3 {
	/*
	 * 	Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
	 *	lista di cognomi, genera una falsa lista di 3 invitati.
	 */
	
	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("Chi invitiamo oggi?");
		
		String[] names = {
				"Pinco",
				"Girolamo",
				"Guido",
				"Gianfilippandrea",
				"Mimmo",
				"Bob",
				"Carlos"
				};
		
		String[] surnames = {
				"Pallo",
				"Da Pesca",
				"La Vespa",
				"Rossi",
				"Mimmi",
				"Spugna"
				};
		
		//Dichiaro la mia lista da 3 sezioni
		String[] list;
		list = new String[3];
		
		//Costruisco la lista
		for (int i = 0; i < 3; i++) { //Dichiarando names.length come indice di random, non uscirò mai dall'array e potrò aggiungere nomi
			list[i] = names[rand.nextInt(names.length)] + " " + surnames[rand.nextInt(surnames.length)];
		}
		
		System.out.println(list[0] + "\n" + list[1] + "\n" + list[2]);
	}

}

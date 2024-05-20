package org.gen.italy;

import java.util.Scanner; //legge l'input utente
import java.util.ArrayList; //serve a memorizzare elenco numeri casuali
import java.util.Random; //serve a generare i numeri casuali

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// chiede all'utente quanti numeri generare
		System.out.print("Quanti numeri vuoi generare? ");
		int quantitaNumeri = sc.nextInt();
		sc.nextLine();

		// creazione ArrayList per memorizzare i numeri casuali generati
		ArrayList<Integer> numeriCasuali = new ArrayList<Integer>();

		// genera numeri casuali unici
		Random r = new Random();
		do { // ciclo che verrà eseguito una volta prima di controllare la condizione posta
				// dopo while.
			int numero = r.nextInt(100) + 1; // Genera numeri casuali tra 1 e 100 (da 0 a 99 + 1) e il numero viene
												// memorizzato nella variabile numero
			if (!numeriCasuali.contains(numero)) { // verifica se il numero generato è già presente nell'ArrayList
													// numeriCasuali.
				numeriCasuali.add(numero); // Aggiunge solo se il numero non è già presente
			} // questo controllo garantisce che ogni numero aggiunto alla lista sia unico.
		} while (numeriCasuali.size() < quantitaNumeri); // .size restituisce il numero di elementi attualmente presenti
															// nell'ArrayList
		// ciclo che continua a eseguire il blocco do finché la dimensione
		// dell'ArrayList numeriCasuali è inferiore a quantitaNumeri

		// visualizzazione dei numeri generati
		System.out.println("Numeri generati:");
		for (int numero : numeriCasuali) { // for-each loop - scorre gli elementi dell'AL numeriCasuali e ad ogni
											// replica del ciclo l'elemento corrente viene memorizzato nella variabile
											// 'numero'
			System.out.print(numero + " "); // non va a capo per ogni numero ma saranno stampati sulla stessa riga
											// separati da uno spazio.
		}
		System.out.println();

		sc.close();
	}
}

package org.generation.italy;

import java.util.Scanner;

public class InsertNumber {
	public static void main(String[] args) {
		//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int userNumber = sc.nextInt();
		sc.close();
		
		if (!(userNumber % 2 == 0)) 
			userNumber += 1;
		
		System.out.println(userNumber);
	}
}

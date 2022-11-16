package org.generation.italy;

import java.util.Random;

public class snack4 {
	/*
	 * Crea due array che hanno un numero di elementi diversi. 
	 * Mostra a video dei nuovi elementi random finchè il numero di elementi presenti nell'array che ne ha di meno 
	 * + quelli mostrati a video non è uguale al numero di elementi presenti nell'array che ne ha di più
	 * --
	 * Creare due array di dimensione diversa e stampare un numero di valori interi casuali 
	 * pari alla differenza di dimensione (es: arr1.length = 3; arr2.length = 10;  --> stampo 7 valori interi casuali)
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] array1 = new int[4];
		int[] array2 = new int[10];
		
		int array1ln = array1.length;
		int array2ln = array2.length;
		
		int diff = array1ln > array2ln ? array1ln - array2ln : array2ln - array1ln;
	
		for(int x = 0; x < diff; x++) {
			int value = rnd.nextInt(100);
			System.out.println(value);
		}
		
	}

}

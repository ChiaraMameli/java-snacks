package org.generation.italy;

public class snack3 {
	/*	
	 * Snack3
	 * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari	 * Snack4 (Bonus)
	 */
	 public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for(int x = 0; x < array.length; x++) {
			
			if(!(x % 2 == 0)) 
				sum += array[x];
		}
		
		System.out.println(sum);
	 }
}

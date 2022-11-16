package org.generation.italy;

import java.util.Random;

public class snack8 {
	public static void main(String[] args) {

		
		Random rnd = new Random(128);
		
		int[] array = new int [10];
		
		for(int x = 0; x < 10; x++) {
			int value = rnd.nextInt(100)-50;
			array[x] = value;
		}
		
		int minValue = 100;
		int maxValue = 0;
		int sum = 0;
		
		for(int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
			
			if(Math.abs(array[a]) < minValue)
				minValue = Math.abs(array[a]);
			
			if(Math.abs(array[a]) > maxValue)
				maxValue = Math.abs(array[a]);
			
			if(array[a] % 5 == 0) {
				sum += array[a];
			}
		}
		
		System.out.println("Il numero più piccolo è " + minValue);
		System.out.println("Il numero più grande è " + maxValue);
		System.out.println("La somma dei multipli di 5 è " + sum);
	}
}

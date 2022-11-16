package org.generation.italy;

public class snack5 {
	
//	trovare il valore minimo
//	trovare il valore massimo
//	calcolare la media
//	calcolare la sommatoria
	
	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int minValue = 100;
		int maxValue = 0;
		int sum = 0;
		
		for(int x = 0; x < arr.length; x++) {
			
			sum += arr[x];
			
			if(arr[x] < minValue)
				minValue = arr[x];	
			
			if(arr[x] > maxValue)
				maxValue = arr[x];	
		}
		
		int average = sum / arr.length;
		
		System.out.println("Il valore minimo è " + minValue);
		System.out.println("Il valore massimo è " + maxValue);
		System.out.println("La media è " + average);
		System.out.println("La somma è " + sum);
	}
}

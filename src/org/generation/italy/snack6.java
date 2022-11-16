package org.generation.italy;

public class snack6 {
	
	//calcolare un array sommatoria dove ogni elemento 
	//corrisponde alla somma degli elementi dei due array alla stessa posizione
	
	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int[] arr3 = new int[10]; 
		
		int minValue = 100;
		int maxValue = 0;
		int sum = 0;
		
		for(int x = 0; x < arr1.length; x++) {
			
			int value = arr1[x] + arr2[x];
			arr3[x] = value;
			System.out.println("La somma dei valori alla posizion n " + (x + 1) + " è " + value);
			
			sum += (arr1[x] + arr2[x]);
			
			if(arr1[x] < minValue)
				minValue = arr1[x];
			if(arr2[x] < minValue)
				minValue = arr2[x];
			
			if(arr1[x] > maxValue)
				maxValue = arr1[x];
			if(arr2[x] > maxValue)
				maxValue = arr2[x];	
		}
		
		System.out.println("----------------");
		
		int average = sum / (arr1.length + arr2.length);
		
		System.out.println("Il valore minimo di entrambi gli array è " + minValue);
		System.out.println("Il valore massimo di entrambi gli array è " + maxValue);
		System.out.println("La media dei valori di entrambi gli array è " + average);
		System.out.println("La somma dei valori di entrambi gli array è " + sum);
	}
}

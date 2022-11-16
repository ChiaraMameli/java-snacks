package org.generation.italy;

public class GreatGatsby {
	public static void main(String[] args) {
		/*
		 * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, 
		 * e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome. 
		 */
	
		String[] firstNames = {"Filippo", "Francsco", "Giulia", "Camilla"};
		String[] lastNames = {"Monteleone", "Manni", "Buffa", "Ronchetti"};
		
		for(int x = 0; x < firstNames.length; x++) {
			System.out.println(firstNames[x] + " " + lastNames[x]);
		}
	}
}

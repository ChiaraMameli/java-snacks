package org.generation.italy;

public class snack7 {
	
//	creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
//	creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
//	trovare e stampare la parola piu' lunga e la sua lunghezza
//	trovare e stampare la parola piu' corta e la sua lunghezza
	
	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		String sentence = "";
		String reversedSentence = "";
		String longestWord = "";
		String shortestWord = "Supercalifragilistichespiralitoso";
		
		for(int x = 0; x < words.length; x++) {
			sentence += words[x] + " ";
			
			if(words[x].length() > longestWord.length())
				longestWord = words[x];
			
			if(words[x].length() < shortestWord.length())
				shortestWord = words[x];
		}
		
		for(int a = words.length - 1; a >= 0; a--) {
			reversedSentence += words[a] + " ";
		}
		
		int longestWordLng = longestWord.length();
		int shortestWordLng = shortestWord.length();	      
		
		System.out.println(sentence);
		System.out.println(reversedSentence);
		System.out.println("La parola più lunga (" + longestWordLng + " caratteri) è " + longestWord);
		System.out.println("La parola più corta (" + shortestWordLng + " caratteri) è " + shortestWord);
	}
}

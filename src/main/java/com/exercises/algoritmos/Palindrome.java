package com.exercises.algoritmos;

public class Palindrome {

	String phrase;
	public Palindrome(String phrase) {
		this.phrase = phrase;
	}
		
	public boolean check() {
		phrase = phrase.replace(" ", "");
		int phraseSize= phrase.length();
		int halfPhraseSize;
		boolean palindrome = true;
		
		if((phraseSize%2)==0) 
			halfPhraseSize = phraseSize/2;
		else
			halfPhraseSize = (phraseSize-1)/2;
		
		for(int i = 0; i<halfPhraseSize; i++) {
			if(phrase.charAt(i) != phrase.charAt(phraseSize-i-1)) {
				palindrome = false;
				break;
			}
		}
		
		return palindrome;
	}
}

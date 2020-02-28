package com.exercises.algoritmos;

public class Palindrome {

	String phrase;
	public Palindrome(String phrase) {
		this.phrase = phrase;
	}
		
	public boolean check() {
		phrase = phrase.replace(" ", "");
		int phrSize= phrase.length();
		int halfPhrSize;
		boolean palindrome = true;
		
		if((phrSize%2)==0) 
			halfPhrSize = phrSize/2;
		else
			halfPhrSize = (phrSize-1)/2;
		
		for(int i = 0; i<halfPhrSize; i++) {
			if(phrase.charAt(i) != phrase.charAt(phrSize-i-1)) {
				palindrome = false;
				break;
			}
		}
		
		return palindrome;
	}
}

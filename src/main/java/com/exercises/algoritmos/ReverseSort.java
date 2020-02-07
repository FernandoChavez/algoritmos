package com.exercises.algoritmos;

public class ReverseSort {
	String word;
	public ReverseSort(String word) {
		this.word = word;
	}
	
	public void reverse() {
		for(int i = word.length()-1; i>=0; i--) {
			System.out.println(word.charAt(i));
		}
	}
}

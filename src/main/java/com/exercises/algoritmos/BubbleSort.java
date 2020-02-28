package com.exercises.algoritmos;

public class BubbleSort {
	int arrayNumbers[];
	
	public BubbleSort(int arrayNumbers[]) {
		this.arrayNumbers=arrayNumbers;
	}
	
	public int[] addBubbleSort() {
		int size = arrayNumbers.length;
		int max;
		for(int j= 0 ; j< size; j++) {
			for(int i = 0; i< size-1-j; i++) {	
				if(arrayNumbers[i]> arrayNumbers[i+1]) {
					max = arrayNumbers[i];
					arrayNumbers[i] = arrayNumbers[i+1];
					arrayNumbers[i+1] = max;
				}
			}
		}
		return arrayNumbers;
	}
}

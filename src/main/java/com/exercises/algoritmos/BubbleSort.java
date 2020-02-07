package com.exercises.algoritmos;

public class BubbleSort {
	
	public int[] addBubbleSort(int arrayNumbers[]) {
		int size = arrayNumbers.length;
		for(int j= 0 ; j< size; j++) {
			for(int i = 0; i< size-1-j; i++) {	
				if(arrayNumbers[i]> arrayNumbers[i+1]) {
					int pivot = arrayNumbers[i];
					arrayNumbers[i] = arrayNumbers[i+1];
					arrayNumbers[i+1] = pivot;
				}
			}
		}
		return arrayNumbers;
	}
}

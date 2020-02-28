package com.exercises.algoritmos;

public class SelectionSort {

	int arrayNumber[];
	
	public SelectionSort(int arrayNumber[]) {
		this.arrayNumber = arrayNumber;
	}
	
	public int[] addSelectionSort() {
		int size = arrayNumber.length;
		
		
		for(int i = 0; i<size; i++) {
			int min = arrayNumber[i];
			int indexMin = i;
			for(int j = i + 1; j <size; j++) {
				if(arrayNumber[j]<min) {
					min=arrayNumber[j];
					indexMin = j;
				}
			}
			if(indexMin != i) {
				arrayNumber[indexMin]=arrayNumber[i];
				arrayNumber[i]= min;
			}
		}
		
		return arrayNumber;
	}
	
}

package com.exercises.algoritmos;

public class MinMax {
	int[] arrayNumber;
	
	public MinMax(int arrayNumber[] ) {
		this.arrayNumber = arrayNumber;
	}
		
	public int[] getMaxMin() {
		int min, max;
		min = max = arrayNumber[0];
		
		if(arrayNumber.length>1) {
			for(int i=1; i<arrayNumber.length; i++) {
				if(max < arrayNumber[i]) 
				   max = arrayNumber[i];
				else 
					if(min > arrayNumber[i]) 
						min = arrayNumber[i];	
			}
		}
		int arrayAnswers[] = {min, max};
		return arrayAnswers;
	}
}

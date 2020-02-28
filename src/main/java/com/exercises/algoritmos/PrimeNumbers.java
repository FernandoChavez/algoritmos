package com.exercises.algoritmos;

import java.util.ArrayList;

public class PrimeNumbers {
	int arrayNumbers[];
	
	public PrimeNumbers(int arrayNumbers[]) {
		this.arrayNumbers = arrayNumbers;
	}
	
	
	public ArrayList<Integer> getPrimeNumbers() {
		ArrayList<Integer> arrayListNumbers = new ArrayList<Integer>();
		boolean flag;
		for(int number :  arrayNumbers) {
			if(number <= 1)
				flag= false;
			else
				flag=true;						
			
			for(int i = 2; i<(number/2); i++) {
				if((number%i) == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag == true)
				arrayListNumbers.add(number);		
		}
		return arrayListNumbers;
	}
}

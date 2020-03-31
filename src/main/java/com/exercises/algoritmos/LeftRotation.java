package com.exercises.algoritmos;

public class LeftRotation {
	static int[] arrayLeftRotation(int [] a, int d) {
		int size = a.length;
        int leftNumber=0;      
        for(int j=0; j<d; j++){
            leftNumber= a[0];
            for(int i = 0; i<size-1; i++)
                a[i]=a[i+1];
            a[size-1] = leftNumber;
        }
        return a;
	}
}
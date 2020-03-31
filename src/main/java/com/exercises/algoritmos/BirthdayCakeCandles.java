package com.exercises.algoritmos;

import java.util.Arrays;

public class BirthdayCakeCandles {
	static int getNumberHigherCandles(int ar[]) {	
		//Sort arrays
		Arrays.sort(ar);
        int count=0;
        int size = ar.length;
        int bigger = ar[size-1];
        
        // Get Numbers of higher candles
        for(int i = size-1; i>=0; i--){
            if(ar[i]== bigger)
                count++;
            else
                break;
        }
        return count;
		
	}
}

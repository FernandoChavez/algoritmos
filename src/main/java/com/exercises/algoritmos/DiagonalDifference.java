package com.exercises.algoritmos;

import java.util.List;

public class DiagonalDifference {
	static int getDiagonalDifference(List<List<Integer>> arr) {
		
		int size =arr.size(), sumRight = 0, sumLeft = 0;
		
        for(int i=0; i<size; i++){
            sumRight += arr.get(i).get(i);     
            sumLeft += arr.get(size-i-1).get(i);  
        }

        return  Math.abs(sumRight-sumLeft);
		
	}
}

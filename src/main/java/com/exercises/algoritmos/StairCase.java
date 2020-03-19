package com.exercises.algoritmos;

public class StairCase {
	static void drawStairCase(int n) {
		String simbol="";
        for(int x=0; x<n; x++){
            String blankspace="";
            for(int y=n-x-1; y>0; y--)
                blankspace+=" ";
            simbol+="#";
            System.out.println(blankspace+simbol);
        }
	}

}

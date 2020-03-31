package com.exercises.algoritmos;

public class Kangaroo {
	static String possibleMatch(int x1, int v1, int x2, int v2) {
		String message = "";
        boolean samePosition= true;
        int lowerPosition=0;
        int biggerJump=0;
        int higherPosition=0;
        int lowerJump=0;

        if(x1<x2 && v1>v2){
            lowerPosition=x1;
            higherPosition = x2;
            biggerJump=v1;
            lowerJump=v2;
        }
        else
            if(x1>x2 && v1<v2){
                lowerPosition=x2;
                higherPosition = x1;
                biggerJump=v2;
                lowerJump=v1;
            }else{
                message="NO";
                samePosition = false;
            }

        if(samePosition){
            while(lowerPosition<higherPosition){
                lowerPosition+=biggerJump;
                higherPosition+=lowerJump;
                if(lowerPosition==higherPosition){
                    message="YES";
                    break;
                }    
                else
                    if(lowerPosition>higherPosition){
                        message= "NO";
                        break;
                    }
            }  
        } 

        return message;   
	}

}

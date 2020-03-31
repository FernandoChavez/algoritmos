package com.exercises.algoritmos;

import java.util.List;

public class GradingStudents {
	public static List<Integer> getGradingStudents(List<Integer> grades){
		int size = grades.size();
        int difGradeMult5;
        
        for(int i=0; i<size; i++){
            if(grades.get(i)>=38){
                difGradeMult5 = 5-(grades.get(i)%5);
                if(difGradeMult5<3){
                   grades.set(i, (grades.get(i)+difGradeMult5));
                }
            }
        }
        return grades;
	}
}

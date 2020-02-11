package com.exercises.algoritmos;

public class SumDigitsIntenger {
	int num;
	
	public SumDigitsIntenger(int num) {
		this.num = num;
	}
	
	public int sumDigitsFirstWay() {
		int sum=0;
		int division = num/10;	
		while(division > 0) {
			sum +=(division%10);
			division /=10;
		}	
		sum +=(num%10);	
		System.out.println(sum);
		return sum;
	}
	
}

package com.exercises.algoritmos;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int arrayNumbers[] = {55, 11, 3, -11, 2, 18, 21, 13, -3};
		//Bubblesort
		
    	/*
		BubbleSort objBubble = new BubbleSort();
		System.out.println("Not Sorting: "+ Arrays.toString(arrayNumbers));
		arrayNumbers=objBubble.addBubbleSort(arrayNumbers);
		System.out.println("Sorting: "+Arrays.toString(arrayNumbers));	 
		*/
		
		
		//Prime numbers
		/*
		ArrayList<Integer> primes = new ArrayList<Integer>();
		PrimeNumbers objArrayPrimeNumbers =  new PrimeNumbers();
		primes = objArrayPrimeNumbers.primeNumbers(arrayNumbers);
		System.out.println(Arrays.toString(primes.toArray()));
		*/
		
		
		
		//reverse Sort
		/*
		String word =  "hola";
		ReverseSort objReverse = new ReverseSort(word);
		objReverse.reverse();
		*/
		
		
		
		//palindrome
		/*
		String phrase = "anita lava la tinaa";
		Palindrome phraseObj = new Palindrome(phrase);
		Boolean palindrome = phraseObj.check();
		if(palindrome)
			System.out.println("It's palindrome");
		else
			System.out.println("It isn't palindrome");
		*/
    	
    	//MAX MIN
    	/*
    	MinMax objMinMax = new MinMax(arrayNumbers);
    	int arrayAnswers[] = objMinMax.getMaxMin();
    	System.out.println("Mix= "+arrayAnswers[0]+", Max = "+arrayAnswers[1]);
    	*/
    	
    	
    	//SunDigitsIntenfer
    	SumDigitsIntenger objSum1 = new SumDigitsIntenger(23545);
    	SumDigitsIntenger objSum2 = new SumDigitsIntenger(9483812);
    	SumDigitsIntenger objSum3 = new SumDigitsIntenger(4);
    	objSum1.sumDigitsFirstWay();
    	objSum2.sumDigitsFirstWay();
    	objSum3.sumDigitsFirstWay();
    	
    	
    }
}

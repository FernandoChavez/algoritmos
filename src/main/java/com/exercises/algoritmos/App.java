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
    	int arrayNumbers2[] = {5,10,342 ,4, 3,};
    	int arrayNumbers3[] = {0};
    	int arrayNumbers4[] = {-55, -124, 999, 3234, 4671, 77777};
    	int arrayNumbers5[] = {};
    	
    	
    	String phrase = "anita lava la tina";
    	String phrase2 = "anita lava la tinaa";
    	String phrase3 = "lamina";
    	String phrase4 = "aamaa";
    	
    	
    	
    	
		//BUBBLESORT
    	//This algorithm is bubbleSort
    	/*
    	BubbleSort objBubble = new BubbleSort(arrayNumbers);
    	System.out.println("Not sorting: " + Arrays.toString(arrayNumbers));
    	int arrayBubbleSort[] = objBubble.addBubbleSort();
    	System.out.println("Sorting: "+Arrays.toString(arrayBubbleSort));
		*/
    	  	
    	
    	
		
		//PRIME NUMBERS
    	/*
    	//The goal is print only prime numbers inside of a array
    	//ArrayList<Integer> primes = new ArrayList<Integer>();
		
    	PrimeNumbers objArrayPrimeNumbers =  new PrimeNumbers(arrayNumbers);
		PrimeNumbers objArrayPrimeNumbers2 =  new PrimeNumbers(arrayNumbers2);
		PrimeNumbers objArrayPrimeNumbers3 =  new PrimeNumbers(arrayNumbers3);
		PrimeNumbers objArrayPrimeNumbers4 =  new PrimeNumbers(arrayNumbers3);
		
		//primes = objArrayPrimeNumbers.getPrimeNumbers();
		//System.out.println(Arrays.toString(primes.toArray()));
		
		System.out.println(objArrayPrimeNumbers.getPrimeNumbers());
		System.out.println(objArrayPrimeNumbers2.getPrimeNumbers());
		System.out.println(objArrayPrimeNumbers3.getPrimeNumbers());
		System.out.println(objArrayPrimeNumbers4.getPrimeNumbers());
		*/
		
    	
		   	
		
		//REVERSE SORT
    	// Here is print a word in reverse
		/*
		String word =  "hola";
		ReverseSort objReverse = new ReverseSort(word);
		objReverse.reverse();
		*/
		
		
    	
		
		//PALINDROME
    	// proof if a phrase is palindrome or not
		
		/*
		Palindrome phraseObj = new Palindrome(phrase4);
		Boolean palindrome = phraseObj.check();
		if(palindrome)
			System.out.println("It's palindrome");
		else
			System.out.println("It isn't palindrome");
		*/
    	
		
    	
		
    	//MAX MIN
    	//getting the min and max numbers from a array int
    	/*
    	MinMax objMinMax = new MinMax(arrayNumbers);
    	MinMax objMinMax2 = new MinMax(arrayNumbers2);
    	MinMax objMinMax3 = new MinMax(arrayNumbers3);
    	MinMax objMinMax4 = new MinMax(arrayNumbers4);
    	MinMax objMinMax5 = new MinMax(arrayNumbers5);
    	
    	int arrayAnswers[] = objMinMax.getMaxMin();
    	int arrayAnswers2[] = objMinMax2.getMaxMin();
    	int arrayAnswers3[] = objMinMax3.getMaxMin();
    	int arrayAnswers4[] = objMinMax4.getMaxMin();
    	
    	System.out.println("Mix= "+arrayAnswers[0]+", Max = "+arrayAnswers[1]);
    	System.out.println("Mix= "+arrayAnswers2[0]+", Max = "+arrayAnswers2[1]);
    	System.out.println("Mix= "+arrayAnswers3[0]+", Max = "+arrayAnswers3[1]);
    	System.out.println("Mix= "+arrayAnswers4[0]+", Max = "+arrayAnswers4[1]);
    	*/
    	
    	
    	
    	
    	//SUM DIGITS INTENGER
    	//Sum each digits of a intenger
    	/*
    	SumDigitsIntenger objSum1 = new SumDigitsIntenger(23545);
    	SumDigitsIntenger objSum2 = new SumDigitsIntenger(9483812);
    	SumDigitsIntenger objSum3 = new SumDigitsIntenger(9);
    	objSum1.sumDigitsFirstWay();
    	objSum2.sumDigitsFirstWay();
    	objSum3.sumDigitsFirstWay();
    	*/
    	
    	
    	
    	//SELECTION SORT
    	//Sort The smallest element is selected from the unsorted array and swapped with the leftmost element, 
    	//and that element becomes a part of the sorted array. This process continues moving unsorted array boundary 
    	//by one element to the right.
    	
    	SelectionSort objSelSort = new SelectionSort(arrayNumbers);
    	System.out.println("Not sorted: " + Arrays.toString(arrayNumbers));
    	int arraySorted[] = objSelSort.addSelectionSort();
    	System.out.println("Sorted: "+Arrays.toString(arraySorted));
    	
    	
    }
}

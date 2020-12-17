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
    	
    	int arrayNumbers6[] = {5 ,89 ,10 ,37, 34, 90, 99, 20};
    	
    	String phrase = "anita lava la tina";
    	String phrase2 = "anita lava la tinaa";
    	String phrase3 = "lamina";
    	String phrase4 = "aamaa";
    	
    	
    	String word = "Liliana";
    	String word2 = "Coffe";
    	String word3 = "Aguinaldo";
    	
    	
    	String time1 = "01:12:57PM";
    	String time2 = "12:00:00PM";
    	String time3 = "09:02:46PM";
    	String time4 = "05:59:59PM";
    	
    	int number = 4;
    	int number2 = 13;
    	int number3 = 16;
    	int number4 = 7;
    	
    	
    	
    	
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
    	
    	int arrayAnswers[] = objMinMax.getMaxMin();
    	int arrayAnswers2[] = objMinMax2.getMaxMin();
    	int arrayAnswers3[] = objMinMax3.getMaxMin();
    	
    	System.out.println("Mix= "+arrayAnswers[0]+", Max = "+arrayAnswers[1]);
    	System.out.println("Mix= "+arrayAnswers2[0]+", Max = "+arrayAnswers2[1]);
    	System.out.println("Mix= "+arrayAnswers3[0]+", Max = "+arrayAnswers3[1]);
    	*/
    	
    	
    	
    	
    	//SUM DIGITS INTENGER
    	//Sum each digits of a intenger
    	
    	SumDigitsIntenger objSum1 = new SumDigitsIntenger(23545);
    	SumDigitsIntenger objSum2 = new SumDigitsIntenger(9483812);
    	SumDigitsIntenger objSum3 = new SumDigitsIntenger(16);
    	//objSum1.sumDigitsFirstWay();
    	//objSum2.sumDigitsFirstWay();
    	objSum3.sumDigitsFirstWay();
    	
    	
    	
    	
    	//SELECTION SORT
    	//Sort The smallest element is selected from the unsorted array and swapped with the leftmost element, 
    	//and that element becomes a part of the sorted array. This process continues moving unsorted array boundary 
    	//by one element to the right.
    	
    	/*
    	SelectionSort objSelSort = new SelectionSort(arrayNumbers);
    	System.out.println("Not sorted: " + Arrays.toString(arrayNumbers));
    	int arraySorted[] = objSelSort.addSelectionSort();
    	System.out.println("Sorted: "+Arrays.toString(arraySorted));
    	*/
    	
    	
    	//Reverse vowels
    	// reverse the vowels that are part of a word or phrase
    	//System.out.println(ReverseVowels.reverseOnlyVowels(word));
    	
    	
    	//TIME CONVERSION
    	//Convert an 12 hours format time to 24 hours format time
    	/*
    	String times[] = {time1, time2, time3, time4};
    	for(String x: times) {
    		System.out.println(TimeConvertion.convert12To24(x));
    	}
    	*/
    	
    	
    	//STAIRCASE
    	//Drawn N stairs conformed with # symbol and the rest with blankspaces
    	//StairCase.drawStairCase(number);
    	
    	
    	//DIAGONAL DIFFERENCES
    	//Given a square matrix, calculate the absolute difference between the sums of its diagonals. 
    	
    	
    	
    	
    	//BirthdayCakeCandles
    	//Get the numbers of the higher candles exist in the cake
    	//System.out.println(BirthdayCakeCandles.getNumberHigherCandles(arrayNumbers));
    	
    	//GRADING STUDENT
    	//Intructions in the following link: https://www.hackerrank.com/challenges/grading/problem
    	
  
    	//LEFT ROTATION
    	//In an array elements, performing a 1 unit left rotation, specificing how man rotations wants
    	//System.out.println(Arrays.toString(LeftRotation.arrayLeftRotation(arrayNumbers2, 4)));
    	
    	
    	
    	//KANGAROO
    	//INTRUCTTIONS HERE: https://www.hackerrank.com/challenges/kangaroo/problem
    	//System.out.println("Will the kangaroos match positions?: "+ Kangaroo.possibleMatch(-2, 4, 2, 2));
    	//System.out.println("Will the kangaroos match positions?: "+ Kangaroo.possibleMatch(-2, 4, 1, 2));
    	
    	
    }
}

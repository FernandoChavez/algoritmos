package com.exercises.algoritmos;

import java.util.Stack;

public class ReverseVowels {

	static String reverseOnlyVowels(String word) {
		String lowerCase = word.toLowerCase();
		StringBuilder sb = new StringBuilder();
		Stack <Character> stack = new Stack<Character>(); // Data Structure
		
		for(int i = 0; i< word.length(); i++) {
			if(isVowel(word.charAt(i))) {
				stack.push(word.charAt(i));
			}
		}
		
		for(int i = 0; i< word.length(); i++) {
			if(isVowel(word.charAt(i))) {
				sb.append(stack.pop());
			}else {
				sb.append(word.charAt(i));
			}
		}
		
		
		return sb.toString();
	}
	
	static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i'|| c == 'o'|| c == 'u';   
	}
	
}

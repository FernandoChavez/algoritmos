package com.exercises.algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void isPalindrome() {
		Palindrome palindrome = new Palindrome("ana");
		boolean result = palindrome.check();
		assertTrue(result);
	}
	
	@Test
	public void isNotPalindrome() {
		Palindrome palindrome = new Palindrome("anaa");
		boolean result = palindrome.check();
		assertFalse(result);
	}
	
	
	@Test(expected=NullPointerException.class)
	public void isNull() {
		Palindrome palindrome = new Palindrome(null);
		boolean result = palindrome.check();
	}

}

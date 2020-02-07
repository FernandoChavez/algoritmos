package com.exercises.algoritmos;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class BubbleSortTest {
	int arrayNumbers[] = {55, 11, 3, -11, 2, 18, 21, 13, -3};
	
	@Test
    public void bubbleSortIsAdded() {
		
		int outputExpected[]= {-11, -3, 2, 3, 11, 13, 18, 21, 55};
        BubbleSort bubbleSort = new BubbleSort();
        int outputReceived[] = bubbleSort.addBubbleSort(arrayNumbers);
        assertArrayEquals(outputExpected, outputReceived);
    }
	
	@Test
    public void bubbleSortIsNotAdded() {
		
		
		int outputExpected[]= {-11, -3, 2, 3, 11, 13, 18, 21, 55};
		
        BubbleSort bubbleSort = new BubbleSort();
        int outputReceived[] = bubbleSort.addBubbleSort(arrayNumbers);
        //assertThat(outputExpected, is(not(outputReceived)));

    }
	
	@Test(expected=NullPointerException.class)
	public void bubbleSortIsNull() {
		int arrayNumbers[] = null;
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.addBubbleSort(arrayNumbers);
		
	}
}

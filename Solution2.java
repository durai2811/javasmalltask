package com.intereface.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Here is a program that sorts a list of numbers in ascending order. The
 * sortNumbers(ArrayList<Integer>) method accepts a list whose elements are to
 * be sorted. The sorting is accomplished using the
 * Collections.sort(ArrayList<Integer>, Comparator<Integer>) method, whose
 * parameters are a list of numbers and a comparator.
 * 
 * Your task is to rewrite the implementation of the
 * sortNumbers(ArrayList<Integer>) method so that it uses a lambda expression
 * instead of using a Comparator<Integer> anonymous inner class.
 * 
 * The main() method is not involved in testing. Requirements:
 * 
 * • Replace the Comparator<Integer> anonymous inner class with a lambda
 * expression. • In the sortNumbers(ArrayList<Integer>) method, you need to sort
 * the list of numbers in ascending order.
 */

public class Solution2 {
	 public static void main(String[] args) {
	        var numbers = new ArrayList<Integer>();

	        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

	        sortNumbers(numbers);

	        for (Integer number : numbers) {
	            System.out.println(number);
	        }
	    }

	    public static void sortNumbers(ArrayList<Integer> numbers) {
//	        Comparator<Integer> comparator = new Comparator<Integer>() {
//	            @Override
//	            public int compare(Integer i1, Integer i2) {
//	                return i1 - i2;
//	            }
//	        };
	    	 Comparator<Integer> comparator =(Integer i1, Integer i2)->i1 - i2;
	    	 Collections.sort(numbers, comparator);
//	        Collections.sort(numbers, (Integer i1, Integer i2)->i1 - i2);
	    }
}

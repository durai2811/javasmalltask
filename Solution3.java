package com.intereface.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Here is a program that sorts a list of strings by their length in ascending
 * order. The sortStringsByLength(ArrayList<String>) method does this. The
 * strings are sorted using the Collections.sort(ArrayList<String>,
 * Comparator<String>) method, which takes a list of strings and a comparator in
 * the form of a lambda expression.
 * 
 * Your task is to rewrite the implementation of the
 * sortStringsByLength(ArrayList<String>) method so that instead of taking a
 * lambda expression it uses a StringComparator object that implements the
 * Comparator<String> interface. Do this without changing the logic of the
 * sortStringsByLength(ArrayList<String >) method.
 * 
 * In other words, in the StringComparator class, the int compare(String s1,
 * String s2) method should return a numeric value according to these rules:
 * 
 * a negative number if the length of string s1 is less than the length of
 * string s2; a positive number if the length of string s1 is greater than the
 * length of string s2; 0 if the lengths of strings s1 and s2 are the same.
 * 
 * The main() method is not involved in testing.
 *  Requirements: 
 *  In a separate file, you need to create a public StringComparator class that implements the
 * Comparator<String> interface.
 * • In the StringComparator class, you need to
 * create a public int compare(String s1, String s2) method.
 * • The compare(String s1, String s2) method must be implemented in accordance with
 * the task conditions. 
 * • In the sortStringsByLength(ArrayList<String>) method,
 * you need to sort the list of strings in ascending order of their length. 
 * • In the sortStringsByLength(ArrayList<String>) method, you need to use your own
 * comparator (a StringComparator object) to sort the list of strings in
 * ascending order of length.
 */
public class Solution3 {
	public static void main(String[] args) {
		var strings = new ArrayList<String>();

		Collections.addAll(strings, "Squirrels", "Amigo", "Java Developer", "CodeGym");

		sortStringsByLength(strings);

		for (String string : strings) {
			System.out.println(string);
		}
	}

	public static void sortStringsByLength(ArrayList<String> strings) {
	//	Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
		strings.sort(new StringComparator());
	}
	
	
}
class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.length()-o2.length();
	}
	
}
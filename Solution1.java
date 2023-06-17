package com.intereface.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The Solution class has a static mentors field, which is populated with
 * CodeGym mentors (CodeGymMentor objects) in the main() method. A mentor
 * (CodeGymMentor class) has a name (name field). The program needs to sort the
 * mentors by the length of their names in ascending order (from shortest to
 * longest).
 * 
 * To sort all the mentors in the mentors list, use the
 * Collections.sort(ArrayList<CodeGymMentor>, Comparator<CodeGymMentor>) method,
 * passing in the list of mentors (mentors) and a sorting comparator.
 * 
 * Your task is to implement this comparator. To do this, in the NameComparator
 * class, you need to implement the Comparator<CodeGymMentor> interface and
 * implement the int compare(CodeGymMentor mentor1, CodeGymMentor mentor2)
 * method, which returns a numeric value according to the following rules:
 * 
 * a negative number if the length of the first mentor's name (mentor1) is less
 * than the length of the second mentor's name (mentor2); a positive number if
 * the length of the first mentor's name (mentor1) is greater than the length of
 * the second mentor's name (mentor2); 0 if the lengths of the names of both
 * mentors (mentor1 and mentor2) are the same.
 * 
 * The main() method is not involved in testing. Requirements:
 * 
 * • In the NameComparator class, you need to implement the
 * Comparator<CodeGymMentor> interface. • In the NameComparator class, you need
 * to create a public int compare(CodeGymMentor, CodeGymMentor) method. • The
 * compare(CodeGymMentor, CodeGymMentor) method must be implemented in
 * accordance with the task conditions.
 */

public class Solution1 {
	public static ArrayList<CodeGymMentor> mentors = new ArrayList<>();

	public static void main(String[] args) {
		Collections.addAll(mentors, new CodeGymMentor("John Squirrels"), new CodeGymMentor("Risha"),
				new CodeGymMentor("Eleanor Carrey"), new CodeGymMentor("Hans Noodles"), new CodeGymMentor("Kim"),
				new CodeGymMentor("Julio Siesta"), new CodeGymMentor("Diego"), new CodeGymMentor("Laga Bilaabo"));

		Collections.sort(mentors, new NameComparator());

		for (CodeGymMentor mentor : mentors) {
			System.out.println(mentor);
		}
	}
}

class CodeGymMentor {
	private String name;

	public CodeGymMentor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Mentor name: " + name;
	}
}

class NameComparator implements Comparator<CodeGymMentor>{

	@Override
	public int compare(CodeGymMentor o1, CodeGymMentor o2) {
		
		return o1.getName().length()-o2.getName().length();  
	}

}

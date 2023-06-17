package com.intereface.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * The Solution class has a static students field, which is populated by
 * students (Student objects) in the main() method. A student (Student class)
 * has a name (name field) and an age (age field). You need to sort the students
 * in the program by age in descending order (from oldest to youngest). To do
 * this, use the Collections.sort(ArrayList<Student>, Comparator<Student>)
 * method, which is passed a list of students (students) and a comparator for
 * sorting in descending order of age.
 * 
 * Your task is to implement this comparator. To do this, in the AgeComparator
 * class, you need to implement the Comparator<Student> interface and implement
 * the int compare(Student student1, Student student2) method, which returns a
 * numeric value according to the following rules:
 * 
 * a negative number if the age of student1 is greater than the age of student2;
 * a positive number if the age of student1 is less than the age of student2; 0
 * if the ages of student1 and student2 are the same.
 * 
 * The main() method is not involved in testing. Requirements:
 * 
 * In the AgeComparator class, you need to implement the Comparator<Student>
 * interface. In the AgeComparator class, you need to create a public int
 * compare(Student, Student) method. The compare(Student, Student) method mustbe
 * implemented in accordance with the task conditions.
 */

public class Solution {
	public static ArrayList<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Collections.addAll(students, new Student("Smith", 22), new Student("Adams", 18), new Student("Stevenson", 19));

		Collections.sort(students, new AgeComparator());

		for (Student student : students) {
			System.out.println(student);
		}
	}
}

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student - " + name + ", age - " + age + '.';
	}
}

class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge()-o2.getAge();
	}
}

package com.te.collection.practice;
/*17. Write a Java program to iterate through all elements in a
linked list starting at the specified position?*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpecifiedNumber {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(98);
		list.add(45);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(100);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the specific position :");
		int pos = scanner.nextInt();
		scanner.close();
		for (int i = pos; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
	}
}

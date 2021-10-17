package com.te.collection.practice;

/*18. Write a Java program to get the first and
 *  last occurrence of the specified elements in a linked list.
*/
import java.util.LinkedList;
import java.util.List;

public class FirstAndLast {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(98);
		list.add(45);
		list.add(5);
		list.add(6);
		list.add(45);
		list.add(100);
		
		System.out.println("First index :"+list.indexOf(45));
		System.out.println("First index :"+list.lastIndexOf(45));

	}
}

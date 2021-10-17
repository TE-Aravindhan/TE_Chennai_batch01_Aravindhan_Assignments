package com.te.collection.practice;

/*19.Write a Java program to retrieve but does not remove,
the first element of a linked list.*/

import java.util.LinkedList;
import java.util.List;

public class Retrieve {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(98);
		list.add(45);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(100);
		

		System.out.println("Orginal List : " + list);
		int ival = list.get(0);
		System.out.println("Retriving first element : " + ival);
		System.out.println("After Retriving first element : " + list);

	}

}

package com.te.collection.practice;

//16. Write a Java program of swap two elements in an array list?

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(98);
		list.add(45);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(100);
		System.out.println("Array List Before Swap = " + list);
		Collections.swap(list, 0, 4);
		System.out.println("Array List After Swap = " + list);
	}

}

package com.te.collection.practice;

//15. Write a Java program to copy one array list into another?

import java.util.ArrayList;
import java.util.List;

public class CopyOf {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
			list.add(98);
			list.add(45);
			list.add(5);
			list.add(6);
			list.add(8);
			list.add(100);
				
		System.out.println("Array List 1 : "+list);
	
		List<Integer> list1 = new ArrayList<Integer>(list);
		
		System.out.println("Array List 2 : "+list1);
	}
}





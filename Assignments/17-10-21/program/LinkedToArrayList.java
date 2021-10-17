package com.te.collection.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedToArrayList {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
			list.add(98);
			list.add(45);
			list.add(5);
			list.add(6);
			list.add(8);
			list.add(100);
				
		System.out.println("LinkedList : "+list);
	
		List<Integer> list1 = new ArrayList<Integer>(list);
		
		System.out.println("Array List  : "+list1);
	}
}

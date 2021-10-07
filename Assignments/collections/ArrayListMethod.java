package com.te.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		System.out.println("----------Initail list---------");
		System.out.println(list);
		System.out.println(" add(data) & add (index,data)");
		list.add(10);
		list.add(20);
		list.add(2, 100);
		list.add(50);
		list.add(90);
		System.out.println("---------After list---------");
		System.out.println(list);

		System.out.println("---------remove(data) & remove(index)-------");
		list.remove(0);
		list.remove(new Integer(100));
		System.out.println("After removing : " + list);

		System.out.println("-------set(index,data)-------");
		list.set(0, 500);
		System.out.println("after set : " + list);

		System.out.println("----------contains(data) & contains(list)-----");
		list.contains(100);

		list.add(20);
		list.add(10);
		list.add(20);

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(50);
		integers.add(90);
		System.out.println(list.containsAll(integers));

		System.out.println(list);

		System.out.println("-------indexof(data) & lastIndex(data)-----");
		System.out.println(list.indexOf(20));
		System.out.println(list.lastIndexOf(10));

		System.out.println("------isEmpty()------");
		System.out.println(list.isEmpty());

		list.addAll(integers);
		System.out.println(list);

		System.out.println("----------revomeall-----------");
		System.out.println(list.removeAll(integers));
		System.out.println(list);

		System.out.println("------------toArray()------------");
		System.out.println(list.toArray());

		System.out.println("----------subList(sIndex,lIndex--------");
		System.out.println(list.subList(0, 2));
 
		System.out.println("--------------get()-----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

			System.out.println("---------------sorting-------------");
			System.out.println("before sort " + list);
			Collections.sort(list);
			System.out.println("after sort " + list);

			System.out.println("--------clear()-----------");
			list.clear();

			System.out.println(list);

		}

	}

}

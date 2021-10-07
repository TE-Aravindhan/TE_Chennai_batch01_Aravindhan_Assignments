package com.te.assignments.area;

public class Perimeter extends Area {

	public void callingArea() {
		super.areaBox();
		perimeterOfBox();
		super.areaRec();
		perimeterOfRec();
	}

	public void perimeterOfBox() {
		double perimeter = 4 * (side);
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}

	public void perimeterOfRec() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}

}

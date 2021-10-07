package com.te.assignments.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 4;
		int space =n-1;
		int star =1;
		for ( int i = 1; i <=n; i++) {
			for (int k = 1; k <= space; k++) {
				System.out.print(" " + " ");
			}
			for ( int j =1; j<=star; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			space--;
			star = star+2;
		}
	}
}

package com.te.assignments.factorial;

public class RecFact {
	public int fact(int n)
	{
		
		return (n<=1 ? 1 : (n*fact(n-1)));
		
		
	}

}

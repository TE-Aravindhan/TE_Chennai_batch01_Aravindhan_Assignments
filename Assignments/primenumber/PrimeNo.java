package com.te.assignments.primenumber;

import java.util.Scanner;

public class PrimeNo {

	public void isPrimeNo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		scanner.close();
		boolean isPrime = true;

		for (int i = 2; i <= num/2; i++) {

			if (num % i == 0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime ? num+" is a prime number" : num + " is not a prime number");
	}

}

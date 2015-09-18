package com.java.prac;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long start = System.currentTimeMillis();

		for (int i = 1; i <= n; i++) {

			long input = in.nextLong();
			System.out.println(solve(input));
		}

		 long end = System.currentTimeMillis();

		 System.out.println("\n\nExecutiont time:  "+(end - start) / 1000);
	}

	static long solve(long input) {

		if (input % 2 != 0) {
			return 0;
		}

		long count = 0;
		long offset = input / 2;

		for (long i = offset; i >= 2; i--) {
			// System.out.println(i);

			// System.out.println(i);

		
			
			if (input % i == 0) {

				//if (i % 2 == 0) {

					count++;

				//	System.out.println(i +" "+input % i);
			//	}

				  //System.out.println(i +" "+input % i);
			}
		}

		// System.out.println(count);
		//count+=2;
		return ++count;
	}

}

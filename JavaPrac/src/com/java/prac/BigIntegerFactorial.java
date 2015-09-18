package com.java.prac;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		BigInteger l = new BigInteger("1");
		BigInteger bi = new BigInteger("0");
		for (int i = 1; i <= n; i++) {
			bi = BigInteger.valueOf(i);
			l = l.multiply(bi);
		}

		System.out.println("BigInteger Factorial " + l);

	}

}


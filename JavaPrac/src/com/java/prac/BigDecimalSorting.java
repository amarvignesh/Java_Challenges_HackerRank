package com.java.prac;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalSorting {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigDecimal tmp = null;
		BigDecimal bd[] = new BigDecimal[n];

		for (int i = 0; i < n; i++) {

			bd[i] = in.nextBigDecimal();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (bd[i].compareTo(bd[j]) == -1) {
					tmp = bd[i];
					bd[i] = bd[j];
					bd[j] = tmp;
				}

			}
		}

		for (int i = 0; i < n; i++) {

			System.out.println(bd[i].toString().replaceAll("^0(\\..*)$", "$1"));

		}

	}

}

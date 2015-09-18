package com.java.prac;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		int n = 0, x = 0, y = 0;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		int a[][] = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				a[i][j] = in.nextInt();

			}
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if (i == j) {
					x = x + a[i][j];
				}

				if ((i + j) == (n - 1)) {
					y = y + a[i][j];
				}

			}
		}

		System.out.println(Math.abs(x - y));

	}

}

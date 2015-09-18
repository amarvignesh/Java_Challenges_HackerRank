package com.java.greedy;

import java.util.Scanner;

public class MarkandToys {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long tmp, total = 0;
		long money = in.nextLong();

		long toyPrice[] = new long[n];
		for (int i = 0; i < n; i++) {

			if (in.nextLong() <= money)
				toyPrice[i] = in.nextLong();

		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (toyPrice[i] > toyPrice[j]) {
					tmp = toyPrice[i];
					toyPrice[i] = toyPrice[j];
					toyPrice[j] = tmp;
				}
			}
		}

		int toysBought = 0;
		while ((total + toyPrice[toysBought]) < money) {

			total += toyPrice[toysBought];

			toysBought++;
		}

		System.out.println(toysBought);

	}

}

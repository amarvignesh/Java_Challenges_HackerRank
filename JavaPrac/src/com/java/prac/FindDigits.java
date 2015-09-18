package com.java.prac;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String input[] = new String[n];

		for (int i = 0; i < n; i++) {

			input[i] = in.next();

		}

		for (int i = 0; i < n; i++) {

			int count = 0;

			int len = input[i].length();
			int a[] = new int[len];

			for (int j = 0; j < len; j++) {
				char c = input[i].charAt(j);
				a[j] = Integer.parseInt(Character.toString(c));

				

				if (a[j] != 0)
					if ((Long.parseLong(input[i]) % a[j]) == 0) {

						count++;

					}

			}

			System.out.println(count);

		}

		in.close();

	}

}

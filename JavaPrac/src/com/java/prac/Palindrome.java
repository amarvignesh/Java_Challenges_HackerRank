package com.java.prac;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String input = in.next();

		int len = input.length();

		int off = len / 2;

		int j = 1;

		for (int i = 0; i < off; i++) {

			if (input.charAt(i) != input.charAt(len - j)) {

				System.out.println("Not a palindrome");
				break;
			}

			j++;

		}

		j -= 1;

		if (j == off) {

			System.out.println("Palindrome");
		}
	}

}

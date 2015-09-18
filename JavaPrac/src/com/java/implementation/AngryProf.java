package com.java.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProf {

	public static void main(String[] args) {

		int T = 0;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		List<String> result_list = new ArrayList<String>();

		for (int i = 0; i < T; i++) {

			int n = in.nextInt();

			int strength_limit = in.nextInt();
			int nos = 0;

			for (int j = 0; j < n; j++) {

				if ((in.nextInt()) <= 0) {
					nos++;
				}

			}
			if (nos >= strength_limit) {

				result_list.add("NO");
			}

			else {
				result_list.add("YES");

			}
		}

		for (String str : result_list) {
			System.out.println(str);
		}
	}

}

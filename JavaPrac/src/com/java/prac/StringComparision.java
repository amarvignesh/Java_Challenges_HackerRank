package com.java.prac;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String tmp;
		int size = input.length();

		int offset = in.nextInt();

	
		for (int i = 0; i <= (size - offset); i++) {
			list.add(input.substring(i, i + offset));

		}

		int list_size = list.size();

		for (int i = 0; i < list_size; i++) {

			for (int j = 0; j < i + 1; j++) {

				if (list.get(i).compareTo(list.get(j)) > 0) {

					tmp = list.get(i);
					list.remove(i);
					list.add(i, list.get(j));
					list.remove(j);
					list.add(j, tmp);

				}
			}

		}

		System.out.println(list.get(list_size - 1));
		System.out.println(list.get(0));

	}

}

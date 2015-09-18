package com.java.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramPairs {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String input[] = new String[T];

		for (int t = 0; t < T; t++) {

			input[t] = in.next();
		}

		for (int i = 0; i < input.length; i++) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			int count = 0;
			for (int j = 0; j < input[i].length(); j++) {

				char c = input[i].charAt(j);

				if (!map.containsKey(c)) {

					map.put(c, 1);

				} else {

					map.put(c, map.get(c) + 1);
				}

				if (j == (input[i].length() - 1)) {

					for (Map.Entry<Character, Integer> me : map.entrySet()) {

						//System.out.print(me.getKey()+" "+me.getValue()+"\n");

						if (me.getValue() % 2 == 0) {
							
							count+=me.getValue();
						}
					}
					
					System.out.println(count);
				}

			}

		}
		
		
		in.close();

	}
}

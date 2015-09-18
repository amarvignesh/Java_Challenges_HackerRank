package com.java.implementation;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}

		in.close();
	}

	private static long Solve(int total, int cost, int w) {

		long noc = 0, now = 0, r = 0, inoc=0;

		noc = total / cost;

		if (noc == w) {
			return ++noc;
		}

		else if (noc > w) {
			now = noc;
			inoc=noc;
			while (now >= w) {

				noc = now / w;
				r = now % w;
				inoc = inoc+noc+r;
				now = now - (noc + r);
			}

			return inoc;

		}

		else {
			return noc;
		}

	}
}

/*
 * else if (noc > w) { // now = noc; q = noc / w; while (q >= w) { q = noc / w;
 * q += noc % w; // noc += q; // now -= q; }
 * 
 * noc += q;
 * 
 * return noc; }
 */

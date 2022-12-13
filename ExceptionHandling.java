package org.percholas;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String args[]) {
		boolean whileLoopCondition = true;
		while (whileLoopCondition) {
			try {
				Scanner s = new Scanner(System.in);
				int a;
				int b;
				a = s.nextInt();
				b = s.nextInt();
				divide(a, b);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void divide(int a, int b) {
		try {
			double d;
			d = (int) a / (int) b;
			System.out.println(d);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

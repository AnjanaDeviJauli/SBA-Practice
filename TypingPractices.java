package org.percholas;

import java.util.Scanner;

public class TypingPractices {
	public static void main(String args[]) {

		TypeABC();
	}

	static void TypeABC() {
		boolean token = true;
		

		while (token) {
			try {
				System.out.println("Enter a string");
				Scanner s = new Scanner(System.in);
				if (s.hasNext("abc")) {
					System.out.println("correct");
					token = false;
				} else {
					throw new MyException("Incorrect Input");
				}
			} catch (MyException e) {
				System.out.println(e);

			}
		}
	}
}


class MyException extends Exception {
	public MyException(String Message) {
		super(Message);
	}
}

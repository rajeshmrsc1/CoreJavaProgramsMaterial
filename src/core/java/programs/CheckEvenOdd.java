package core.java.programs;

import java.util.*;

public class CheckEvenOdd {

	static boolean isEvenOdd(int num) {

		if (num % 2 == 0) {
			System.out.println("number is even ");

		} else {
			System.out.println("number is odd  ");
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter any number");
		int num = in.nextInt();
		isEvenOdd(num);
in.close();
	}

}

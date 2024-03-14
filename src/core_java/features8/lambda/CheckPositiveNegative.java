package core_java.features8.lambda;

import java.util.Scanner;

interface PositiveNegative {
	boolean positiveNegative(int a);
}

public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number to check whether given number is positive or negative");
		PositiveNegative pn = (p) -> (p >= 0);
		if (pn.positiveNegative(sc.nextInt())) {
			System.out.println("positive number");
		} else {
			System.out.println("negative number");
		}
	}
}

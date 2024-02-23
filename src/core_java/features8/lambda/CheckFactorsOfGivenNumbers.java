package core_java.features8.lambda;

import java.util.Scanner;

interface checkFators{
	
	boolean isFactor(int a,int b);
}


public class CheckFactorsOfGivenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int a = sc.nextInt();
		System.out.println("enter number2");
		int b = sc.nextInt();
		checkFators checkFators = (c,d)->(c%d)==0;
		
		if(checkFators.isFactor(a, b)) {
			System.out.println(b+"is factors of"+a);
		}else {
			System.out.println(b+"is not factors of"+a);
		}
	}
}

package core_java.features8.lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList
		= new ArrayList<Integer>(Arrays.asList(23,68,87,98,33,45));
		
		/**
		 * display all details
		 */
		arrayList.forEach(a->System.out.println(a));
		
		/**
		 * Display only even number
		 */
		arrayList.forEach(a->{
			if(a%2==0) {
				System.out.println(a);
			}
		});
		
	}
}

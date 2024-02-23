package core_java.features8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSortByLambdaExpression {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = 
				new ArrayList<Integer>(Arrays.asList(12,4,5,132,98,234,7,9));
		
		System.out.println("before sorting ......");
		
		arrayList.forEach(a->System.out.println(a));
		
		System.out.println("after sorting ......");
		
		Collections.sort(arrayList,(a,b)->(a>b)?1:(a<b)?-1:0);
		
		arrayList.forEach(a->System.out.println(a));
	}
}

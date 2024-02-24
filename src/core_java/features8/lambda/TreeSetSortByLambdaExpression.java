package core_java.features8.lambda;

import java.util.TreeSet;

public class TreeSetSortByLambdaExpression {

	public static void main(String[] args) {
		
		TreeSet<Integer>  treeSet = 
				new TreeSet<Integer>((s1,s2)->(s1>s2)?-1:(s1<s2)?1:0);
		
		treeSet.add(23);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(1);
		treeSet.add(1);
		treeSet.add(231);
		
		System.out.println("Before Sorting........");
		treeSet.forEach(a->System.out.println(a));
		System.out.println("After Sorting.........");
	}
}

package core_java.features8.lambda;

import java.util.TreeSet;

public class TreeSetStringSortBy {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>((a,b)->b.compareTo(a));
		
		treeSet.add("zxy");
		treeSet.add("abc");
		treeSet.add("gre");
		treeSet.add("abcxre");
		treeSet.add("yrewq");
		treeSet.add("abcd");
		
		System.out.println("sorting in descending order");
		treeSet.forEach(a->System.out.println(a));
	}
}

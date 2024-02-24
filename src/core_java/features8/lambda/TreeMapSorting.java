package core_java.features8.lambda;

import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> 
		treeMap = new TreeMap<Integer,String>((t1,t2)->(t1<t2)?1:(t1>t2)?-1:0);
		
		treeMap.put(1, "Noida");
		treeMap.put(2, "Delhi");
		treeMap.put(3, "Mumbai");
		treeMap.put(4, "Bangalore");
		treeMap.put(10, "Chennai");
		
		treeMap.forEach((a,b)->System.out.println(a+"="+b));
	}
}

package core_java.features8.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ToChangeSomethingInList {

	public static void main(String[] args) {
		
		Consumer<List<Integer>> consumer = integers->{
			for(int i=0;i<integers.size();i++) {
				integers.set(i, 2*integers.get(i));
			}
		};
		
		Consumer<List<Integer>> consumer2 
		= integers->integers.stream().forEach(a->System.out.println(a));
		
		List<Integer> integers = 
				new ArrayList<Integer>(Arrays.asList(123,876,543,333));
		
		try {
			consumer.accept(integers);
			consumer2.andThen(consumer).accept(integers);
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
		
	}
}

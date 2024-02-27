package core_java.features8.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class CompareTwoListByLambdaExpression {

	public static void main(String[] args) {
		
		List<Integer>  integers1
		= new ArrayList<Integer>(Arrays.asList(45,87,90,32));
		
		List<Integer>  integers2
		= new ArrayList<Integer>(Arrays.asList(45,87,90,32));
		
		BiConsumer<List<Integer>,List<Integer>> biConsumer=(list1,list2)->{
			
			if(list1.size()!=list2.size()) {
				System.out.println("false");
			}else {
				for(int i=0;i<list1.size();i++) {
					
					if(list1.get(i)!=list2.get(i)) {
						System.out.println("false");
						return;
					}
					System.out.println("true");
				}
			}
		};
		
		biConsumer.accept(integers1, integers2);
	}
}

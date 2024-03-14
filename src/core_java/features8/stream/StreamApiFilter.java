package core_java.features8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiFilter {

public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(132,654,-9,-7,333);
		
		List<Integer> integers2 = 
				integers.stream().filter(a->a>0).collect(Collectors.toList());
		
		System.out.println(integers2);
		
		//map functionality
		List<Integer> mapInteger =
				integers.stream().map(b->b*4).collect(Collectors.toList());
		
		System.out.println(mapInteger);
	}
}

package core_java.features8.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ToPrintStringStartWithA {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>(
				Arrays.asList("abhi","abdul","vinay","tiwari","kashif","aminabad")
				);
		
		Predicate<String> predicate = (s)->s.startsWith("a");
		for (String string : strings) {
			if(predicate.test(string)) {
				
				System.out.println(string);
			}
		}
	}
}

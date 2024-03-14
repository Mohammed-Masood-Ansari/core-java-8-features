package core_java.features8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamApiCount {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
				new Product(123,"mobile", 130, "active"),
				new Product(420,"bottel", 20, "notactive"),
				new Product(231,"headphone", 234, "notactive"),
				new Product(111,"marker", 222, "active")
				);
		long count=products.stream().filter(a->a.getActive().equals("active")).count();
		
		System.out.println(count);
	}
}

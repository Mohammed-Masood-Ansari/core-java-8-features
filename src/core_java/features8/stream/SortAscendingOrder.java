package core_java.features8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscendingOrder {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
				new Product(123,"mobile", 130, "active"),
				new Product(420,"bottel", 20, "notactive"),
				new Product(231,"headphone", 234, "notactive"),
				new Product(111,"marker", 222, "active")
				);
		//it will sort with the help of natural order
		List<Product> products2 =
				products.stream().sorted(Comparator.comparing(Product::getId)).collect(Collectors.toList());
		
		products2.forEach(a->System.out.println(a));
		
		System.out.println(".................................................");
		
		//for descending order
		List<Product> products3 =
				products.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());
		products3.forEach(p->System.out.println(p));
	}
}

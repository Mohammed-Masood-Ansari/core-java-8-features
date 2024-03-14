package core_java.features8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDriverMap {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
				new Product(123,"mobile", 130, "active"),
				new Product(420,"bottel", 20, "notactive"),
				new Product(231,"headphone", 234, "notactive"),
				new Product(111,"marker", 222, "active")
				);
		
		/*
		 * filter if product active
		 */
		List<Product> products2 = 
				products.stream().filter(p->p.getActive().equals("active")).collect(Collectors.toList());
		
	//	products2.forEach(a->System.out.println(a));
		
		/*
		 * transform price with 30 rupees
		 */
		
		List<Product> products3 = 
				products.stream().map(p->new Product(p.getId(), p.getName(),p.getPrice()+30, p.getActive())).collect(Collectors.toList());
		
		products3.forEach(a->System.out.println(a));
	}
}

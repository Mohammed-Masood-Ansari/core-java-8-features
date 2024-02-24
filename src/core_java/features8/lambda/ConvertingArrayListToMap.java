package core_java.features8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertingArrayListToMap {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>(Arrays.asList(new Student(123, "huma"),
				new Student(1, "quraishi"), new Student(100, "mohammad"), new Student(60, "Kaif")));

		System.out.println("printing data from list");
		students.forEach((a) -> {
			System.out.print(a.getId()+" = ");
			System.out.println(a.getName());
		});

		Map<Integer, String> map = new HashMap<Integer, String>();

		students.forEach((a) -> {
			map.put(a.getId(), a.getName());
		});

		System.out.println("printing data from map");
		
		map.forEach((c,d)->{System.out.print(c+" = "+d+"\n");});
	}
}

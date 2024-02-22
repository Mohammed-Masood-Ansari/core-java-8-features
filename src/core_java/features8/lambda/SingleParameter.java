package core_java.features8.lambda;

interface Program3{
	void print();
}

public class SingleParameter {

	static void function(Program3 p) {
		p.print();
	}
	
	public static void main(String[] args) {
	
		function(()->System.out.println("Hello"));
	}
}

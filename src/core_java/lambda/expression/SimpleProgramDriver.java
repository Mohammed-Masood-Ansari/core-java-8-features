package core_java.lambda.expression;

public class SimpleProgramDriver {

	public static void main(String[] args) {
		
		SimpleProgram program = ()->System.out.println("m1() method");
		
		program.m1();
		
		SimpleProgram.m1(21, 5);
		
	}
}

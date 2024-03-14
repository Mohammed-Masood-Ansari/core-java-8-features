package core_java.lambda.expression;

public class OneParameterDriver {

	public static void main(String[] args) {
		
		OneParameter oneParameter =(a,b)->{System.out.println(a+b);};
		
		oneParameter.add(32, 19);
	}
}

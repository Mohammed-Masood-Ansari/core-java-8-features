package core_java.features8.lambda;

public class Program1Driiver {

	public static void main(String[] args) {
		
		Program1 z=(int x)-> System.out.println(3+x);
		
		Program1 x = (int u)-> System.out.println(4*u);
		
		z.getData(5);
		x.getData(6);
		
		Program2 program2 = ()->{System.out.println("What is your name");};
		program2.getMsg();
	}
}

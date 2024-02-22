package core_java.features8.lambda;

interface P2{
	void print(int a,int b);
}

public class DoubleParameter {

	static void display(P2 p,int a,int b) {
		p.print(a, b);
	}
	
	public static void main(String[] args) {
		display((a,b)->System.out.println(a+" "+b),23,7);
	}
}

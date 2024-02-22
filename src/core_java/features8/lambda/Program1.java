package core_java.features8.lambda;

public interface Program1 {

	public void getData(int a);
	
	default void normalMethod() {
		System.out.println("Data----Stored-----");
	}
}

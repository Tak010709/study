package lang.wrapper;

public class WrapperUtillMain {
	
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10");
		
		int intValue = Integer.parseInt("10");
		
		System.out.println("sum : " + Integer.sum(10,  20));
		System.out.println("min : " + Integer.min(10,  20));
		System.out.println("max : " + Integer.max(10,  20));
	}

}

package learningjavaDL;

public class SwapNumbers {

	public static void main(String[] args) {
		float first = 2.40f , second = 3.50f;
		
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("second number = " + second);
		
		//value of second is assigned to first
		first = second;
		//value of first is assigned to second
		second = first;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("second number = " + second);
		
		
		
	}

}

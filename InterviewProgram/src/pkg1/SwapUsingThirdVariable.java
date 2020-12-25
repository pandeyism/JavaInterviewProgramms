package pkg1;

public class SwapUsingThirdVariable {
	
	public static void main(String[] args) {
		
		int x=5;
		int  y=10;
		
		int t;  // using third variable
		t=x;
		x=y;
		y=t;
		
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

}

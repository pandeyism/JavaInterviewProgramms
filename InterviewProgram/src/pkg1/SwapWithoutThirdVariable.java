package pkg1;

public class SwapWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int x=5;  //0101
		int y=10; //1010
		//1st method using simple addition
	//	x=x+y;   //5+10=15
	//	y=x-y;   //15-10=5
	//	x=x-y;   //15-5=10
		
		//2nd approach
	//	x=x*y;   //50
	//	y=x/y;   //5
	//	x=x/y;  //10
		
		//3rd approach using ^
		
		x=x^y; //15====1111
		y=x^y;  //10=====1010
		
		x=x^y;  //5====0101
		
		System.out.println(x);
		
		System.out.println(y);
		
	}

}

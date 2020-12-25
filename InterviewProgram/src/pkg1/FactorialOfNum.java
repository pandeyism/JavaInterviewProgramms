package pkg1;

public class FactorialOfNum {
	//fact of 5=5*4*3*2*1=120
	//fact of 4=4*3*2*1=24
	//fact of 3=3*2*1=6
	//fact of 2=2*1=2
	//fact of 1=0
	//fact of 0=1
	
	//1st method is non recursive method to find factorial of number
	
	public static int factorial (int num)
	{
		int fact =1;
		
		if (num==0)
		return 1;
		
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		
		}
	      return fact;
}
	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(factorial(3));
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(-1));
		
	}

}

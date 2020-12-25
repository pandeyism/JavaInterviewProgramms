package pkg1;

public class FactorialOfNum1 {
	
	//2nd by using recursive function 
	// recursive function---- a function is calling itself
	
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		
		else return (num*fact(num-1));
	}
	public static void main(String[] args) {
		System.out.println(fact(3));
		System.out.println(fact(2));
		System.out.println(fact(1));
		System.out.println(fact(0));
	}

}

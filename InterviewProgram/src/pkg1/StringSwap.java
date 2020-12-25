package pkg1;

public class StringSwap {
	
	public static void main(String[] args) {
		//WAP to swap string without using temp or 3rd variable
		
		String a="Hello";
		String b="World";
		System.out.println("Before swapping");
		System.out.println("The value of a is :" +a);
		System.out.println("The value of b is :" +b);
		
		//1st append a and b
		a=a+b ;//HelloWorld
		
		//Store initial string a in string b;
		
		b=a.substring(0, a.length()-b.length());
		
		//Store initial string b in string a
		
		a=a.substring(b.length());
		
		System.out.println("After swapping");
		System.out.println("the value of a is :" + a);
		System.out.println("the value of b is:" +b);
		
		
	}

}

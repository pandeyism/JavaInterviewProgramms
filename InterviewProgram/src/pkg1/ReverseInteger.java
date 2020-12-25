package pkg1;
// Very important interview questions

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		int num=12345; //54321
		int rev=0;
		while(num !=0) {
			rev= rev * 10 + num%10;
			
			num=num/10;
		}
		
		  System.out.println("Reverse of Number is :: " + rev);
		  
		  //2. using stringBuffer method
		  
		  long num1=12345678;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		  
	}

}

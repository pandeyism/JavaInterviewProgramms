package pkg1;

public class PalindromeNumber {
	
	//151, 313  ,34543,   78987
	
	public static void isPalindromeNumber(int num) {
		System.out.println("Given Number is :" + num);
		
		int r=0;
		int sum= 0;
		int t;
		t=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10) + r;
			num=num/10;
		}
		
		if(t==sum) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number");
		}
			
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(152);
		isPalindromeNumber(7897);
		
	}

}

package pkg1;

public class PrimeNumber1 {
	
	public static boolean isPrimeNumber(int num) {
		
		// considering edge or corner cases
		if(num<=1) {
			return false;
		}
	   for(int i=2; i<num; i++) {
		   if(num%i==0) {
			   return false;
		   }
	   }
	            return true;
	}  
	
	   public static void getPrimeNumbers(int num) {
		   System.out.println("prime number upto" +num);
		   System.out.println();
		   for(int i=2;i<=num;i++) {
			   if(isPrimeNumber(i))
				   System.out.println( i +" ");
		   }
		   
	   }

	
	public static void main(String[] args) {
		System.out.println("2 is prime number : "  +isPrimeNumber(2));
		System.out.println("3 is prime number : " +isPrimeNumber(3));
		System.out.println("10 is prime Number :"  +isPrimeNumber(10));
		System.out.println("-1 is prime number :"  +isPrimeNumber(-1));
		System.out.println("1 is prime number :"  +isPrimeNumber(1));
		System.out.println("17 is prime number :"  +isPrimeNumber(17));
		System.out.println("0 is prime Number :" +isPrimeNumber(0));
		System.out.println("-5 is prime number:"+ isPrimeNumber(-5));
		System.out.println("-12 is prime number :" + isPrimeNumber(-12));
		getPrimeNumbers(10);
		getPrimeNumbers(20);
		getPrimeNumbers(100);
		
	}

}

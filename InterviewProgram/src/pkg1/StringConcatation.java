package pkg1;

public class StringConcatation {
	
	public static void main(String[] args) {
		
		String x="Hello";
		
		String y="Sanjeev";
		
		int a=400;
		int b=20;
		System.out.println(x+y);
		System.out.println(x+y+a+b);//string can be concatenaded with any data type like integer,float,character etc
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
	}

}

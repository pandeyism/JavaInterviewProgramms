package pkg1;

public class ReverseAString {
	
	// String is immutable , it cannot be reversed with existing function; and it doesnt have string reverse function
	
	public static void main(String[] args) {
		
		String str="Sanjeev is good boy";
		String rev =" ";
		int len = str.length();
		
		System.out.println(len);
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		
		// 2nd method using String Buffer class, it is mutable and it has reverse function
		
		StringBuffer sf= new StringBuffer(str);
		System.out.println(sf.reverse());
		
		
		
		
	}

}

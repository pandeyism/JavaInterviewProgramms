package pkg1;

public class StringManupulation {
	public static void main(String[] args) {
		
		String str="The rains have started here along with hail storms";
		
		String str1="The rains have Started here along with Hail storms";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf("s")); //1st occurence of s
		
		System.out.println(str.indexOf("s", 9 +1)); //2nd occurence of s
		
		System.out.println(str.indexOf("s",15 +1)); //3rd occurence of s
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("winds"));//it will not throw error but it ruturn as -1
		
		System.out.println(str.equals(str1));//string comparison,
		//it will return either true or false;this method is case sensitive
		
		System.out.println(str.equalsIgnoreCase(str1));//IT IS NOT CASE SENSITIVE
		
		System.out.println(str.substring(0, 22));
		
		String s="    Hello Sanjeev    ";
		System.out.println(s.trim());//it will remove before space and after space
		
		System.out.println(s.replace(" ", ""));
		
		String sp="01:10:2020";
		System.out.println(sp.replace(":", "/"));
	}

}

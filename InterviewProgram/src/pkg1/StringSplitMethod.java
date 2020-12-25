package pkg1;

public class StringSplitMethod {
	
	public static void main(String[] args) {
		String test="I_am_Sanjeev_Kumar";
		String test1[] =test.split("_");
		for(int i=0; i<test1.length; i++ )
		{
			System.out.println(test1[i]);
		}
		
	}

}

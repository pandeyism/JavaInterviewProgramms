package pkg1;

public class DublicateElementsArray {
	
	public static void main(String[] args) {
		
		String names[] = {"sanjeev", "java", "javascript", "ruby", "python", "java", "c" ,"Sanjeev","sanjeev"};
		
		//1st method compare each element; Time complexity will be O(n*n); This is the worst solution;
		//Whenever we use two for loop the time complexity will be O(n*n);
		//we must always prefer O(n) solution
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					
					System.out.println("Duplicate Element is :" + names[i]);
				}
			}
			
		}
	
	}
}

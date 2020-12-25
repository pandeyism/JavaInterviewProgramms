package pkg1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementBySet {
	
	public static void main(String[] args) {
		
		String names []= {"java", "c", "python","python", "java"};
		
		//Using HashSet it stores unique values .........java collection
		// Time complexity of this solution is O(n); This is expected solution in intervew ,important
		
		Set<String> store=new HashSet<String>(); //set is an interface ; HashSet is class, it is implementing set interface
		
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate element : " +name);
			}
		}
	   System.out.println("**********Using HashMap Soulution******");
	   
	   
	   // Using HashMap- It allows duplicate element 
	   
	   Map<String,Integer> StoreMap= new HashMap<String,Integer>();
	   for(String name:names) {
	   Integer count=StoreMap.get(name);
	   
	   if(count==null) {
		   StoreMap.put(name, 1);
	   }else {
		   StoreMap.put(name, ++count);
	   }
	   }
	   
	   //get the values of HashMap
	   
	   Set<Entry<String,Integer>> enteryset=StoreMap.entrySet();
	   for(Entry<String,Integer> entry:enteryset) {
		   if(entry.getValue()>1) {
			   System.out.println("Duplicate element : " + entry.getKey());
		   }
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
}

package pkg1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
	
	
	public static void main(String[] args) {
		
		System.out.println("1st Method using Java 8 with forEach loop with Lambada Expression");
		
		ArrayList<String> tvseries= new ArrayList<String>();
		tvseries.add("Game of Thrones");
		tvseries.add("Breaking Bad");
		tvseries.add("Wrestelmania");
		tvseries.add("Kaun Banega Carorepati");
		tvseries.add("Man vs Wild");
		tvseries.add("Narcos");
		tvseries.add("Catch Me If You Can");
		//Using Java 8 with forEachlooop with Lambada Expression
		
		tvseries.forEach(shows -> {
			System.out.println(shows);
		});
		
		System.out.println("...........2nd Method Using Iterator............");
		
		//2nd method using Iterator
		Iterator<String> it=tvseries.iterator();
		while(it.hasNext()) {
			String shows=it.next();
			System.out.println(shows);
		}
		
		System.out.println(".......3rd Method using iterator along with lambada expression and forEachMethod() ......");
		//3rd method using iterator forEachRemaining  method()
		
		it=tvseries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		System.out.println("........using for each loop.......");
		
		
		//4th using simple foreach loop
		for(String show:tvseries) {
			System.out.println(show);
		}
		
		
		// 
		
		
		
		
		
		
		
		
		
	}

}

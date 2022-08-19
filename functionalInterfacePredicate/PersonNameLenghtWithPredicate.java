package functionalInterfacePredicate;

import java.util.function.Predicate;

public class PersonNameLenghtWithPredicate {

	public static void main(String[] args) {
		

Predicate<String>  predicate=(name) -> name.length()>=7;
boolean test = predicate.test("Sanosh");
	System.out.println(test);		
				
			
	}
}

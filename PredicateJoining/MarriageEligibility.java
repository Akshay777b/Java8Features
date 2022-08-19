package PredicateJoining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import votingEligibilityCheck.Person;

public class MarriageEligibility {

	public static void main(String[] args) {
		
		//	List al = new ArrayList();
			
			Person p1 = new Person ("akshay",27);
			Person p2 = new Person ("pooja",26);
			Person p3 = new Person ("pooju",22);
			Person p4 = new Person ("akshada",75);
			Person p5 = new Person ("shontu",13);
			Person p6 = new Person ("pilludi",32);
					
					
			List<Person> al = new ArrayList();
			al.add(p1);
			al.add(p2);
			al.add(p3);
			al.add(p4);
			al.add(p5);
			al.add(p6);
			
	Predicate<Person> lowerAgeLimit = (p)-> p.getAge()>=21;
	Predicate<Person> UpperAgeLimit = (p)-> p.getAge()<=60;
	
	System.out.println("Predicate OR Method");
	for(Person person:al) {
		
		Predicate<Person> predicate = lowerAgeLimit.or(UpperAgeLimit);
		
	     boolean test = predicate.test(person);
	     
	      if(test) {
	    	  
	    	  System.out.println(person);
	      }


	}	
	System.out.println(" ");
	System.out.println("Predicate AND Method");

	for(Person person:al) {
		
	Predicate<Person> predicate1 = lowerAgeLimit.and(UpperAgeLimit);
	     
	     boolean test1 = predicate1.test(person);
	      if(test1) {
	    	  System.out.println(person);
	      }

	}		
			
			
			
	}			
}

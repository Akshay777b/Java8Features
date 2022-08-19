package votingEligibilityCheck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	
	
	public static void main(String[] args) {
		
	//	List al = new ArrayList();
		
		Person p1 = new Person ("akshay",27);
		Person p2 = new Person ("pooja",26);
		Person p3 = new Person ("pooju",24);
		Person p4 = new Person ("akshada",17);
		Person p5 = new Person ("shontu",13);
		Person p6 = new Person ("pilludi",32);
				
				
		List<Person> al = new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		Predicate<Person> predicate =(s) -> s.getAge()>=30;
		for(Person person :al) {
			boolean test = predicate.test(person);
			if(test) {
				System.out.println(person);
			}
		}
		
		}
	}


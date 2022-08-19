package mathchingOperation;

import java.util.ArrayList;
import java.util.List;

public class MatchingDemo {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Akshay",28,"India"));
		list.add(new Person("Pooja",24,"USA"));
		list.add(new Person("Shivam",28,"CANADA"));
		list.add(new Person("Pranu",28,"India"));
		list.add(new Person("Sweetu",28,"UK"));
		list.add(new Person("Kajal",28,"CHINA"));
		
	//	boolean anyMatch = list.stream().anyMatch(p->p.getCountry().equals("India"));
	//	System.out.println(anyMatch);
		
		boolean allMatch = list.stream().allMatch(p->p.getCountry().equals("India"));
           System.out.println(allMatch);
		
		
		
	}
}

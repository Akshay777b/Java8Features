package findingOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import mathchingOperation.Person;

public class FindingOperationDemo {

public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Akshay",28,"India"));
		list.add(new Person("Pooja",24,"USA"));
		list.add(new Person("Shivam",28,"CANADA"));
		list.add(new Person("Pranu",28,"India"));
		list.add(new Person("Sweetu",28,"UK"));
		list.add(new Person("Kajal",28,"CHINA"));
		
//		Optional<Person> findFirst = list.stream().filter(p->p.getCountry().equals("India")).findFirst();
//		System.out.println(findFirst);
		
		Optional<Person> findFirst = list.stream().filter(p->p.getCountry().equals("India")).findAny();
		System.out.println(findFirst);
		
		
		
		
}
}

package filterOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonFilter {

	
	public static void main(String[] args) {
		
		Person p1 = new Person("Akshay",28,"Software Engineer");
		Person p2 = new Person("pooja",23,"Software Engineer");
		Person p3 = new Person("shontu",24,"Software Engineer");
		Person p4 = new Person("pranu",3,"Software Engineer");
		Person p5 = new Person("sweetu",26,"Software Engineer");
		
		List<Person> list = new ArrayList();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Stream<Person> stream = list.stream();
		 Stream<Person> filter = stream.filter((p) -> p.getAge() >=24);
	//	 Stream<Person> filter = stream.filter((p) -> p.getAge() >=24);
	//	 Stream<Person> filter1 = stream.filter((p) -> p.getAge() >=24 && p.getAge()<=23);
		   
		 filter.forEach(p -> System.out.println(p.getName()));  
		   
	//	 filter.forEach(p -> System.out.println(p.getName()));  
		   
		   
		   
		   
		   
		
	}
}

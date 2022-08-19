package spliterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpecialIteratorDemo {
public static void main(String[] args) {
	

	
	List<String> list = new ArrayList<>();
	
	list.add("Akshay");
	list.add("pooja");
	list.add("pranu");
	list.add("Akki");
	
	Iterator<String> iterator = list.iterator();
	
//	while(iterator.hasNext()) {
//		
//		String next = iterator.next();
//		System.out.println(next);
//		
//	}
	
	
//	  iterator.forEachRemaining(name-> System.out.println(name));
	
	iterator.forEachRemaining(System.out::println);
}
}
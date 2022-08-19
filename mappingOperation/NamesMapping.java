package mappingOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesMapping {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("Akshay");
		list.add("pooja");
		list.add("shivam");
		list.add("praniti");
		list.add("sweetu");
		
	   Stream<String> stream = list.stream();
		Stream<String> map = stream.map(name -> name.toUpperCase());
		map.forEach(name -> System.out.println(name));
	}
	
}

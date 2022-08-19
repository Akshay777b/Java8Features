package filterOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesFilter {
	
public static void main(String[] args) {
	
	List<String> list = new ArrayList();
	
	list.add("Akshay");
	list.add("pooja");
	list.add("praniti");
	list.add("Akki");
	list.add("shivam");
	
	Stream<String> stream = list.stream();
	
	 Stream<String> filterName = stream.filter(name -> name.startsWith("A"));

	    filterName.forEach(name-> System.out.println(name));
}
	
	
}

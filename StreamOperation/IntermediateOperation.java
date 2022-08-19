package StreamOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {

	public static void main(String[] args) {
		
	
	List<Integer> list = new ArrayList();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	
    Stream<Integer> stream = list.stream();
    Stream<Integer> filter = stream.filter(i -> i>=30);
     
    filter.forEach(i-> System.out.println(i));
	
	
	}	
}

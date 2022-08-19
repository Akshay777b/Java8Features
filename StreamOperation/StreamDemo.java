package StreamOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Integer arr[]= {10,20,30,40,50,60};
		
		Stream<Integer> stream = Stream.of(arr);
		
		            stream.forEach(i-> System.out.println(i));
		
		List<Integer> list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		
		
		Stream<Integer> stream2 = list.stream();
	//	System.out.println(stream2);
		stream2.forEach(i-> System.out.println(i));
	}

	
}

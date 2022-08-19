package slicingOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SlicingOperationMethods {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList();
		countries.add("India");
		countries.add("USA");
		countries.add("London");
        countries.add("ShriLanka");
		countries.add("Japan");
		countries.add("India");
		countries.add("Japan");

		
		// Distinct Method : no duplicate object
		
//         Stream<String> stream = countries.stream();
//          Stream<String> distinct = stream.distinct();
//         distinct.forEach(country -> System.out.println(country));
//		
		// limit method : limited no. which we passed
		
//         Stream<String> stream = countries.stream();
//         
//         Stream<String> limit = stream.limit(3);
//         limit.forEach(country-> System.out.println(country));
//         
         
		Stream<String> stream = countries.stream();
         
         Stream<String> skip = stream.skip(3);
         skip.forEach(country-> System.out.println(country));
         
         
         
         
         
	}
}

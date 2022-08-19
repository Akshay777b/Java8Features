package nameStartWith;

import java.util.function.Predicate;

public class PredicateNameStaringWith {

	public static void main(String[] args) {
		
	
	String a1[]= {"Akshay","Pooja","Pooju","Shontu","Pillu","Akshada"};

	Predicate<String> predicate = (a)-> a.startsWith("P");
	
	for(String s:a1) {
		boolean test = predicate.test(s);
		if(test) {
			System.out.println(s);
		}
	}

}
}
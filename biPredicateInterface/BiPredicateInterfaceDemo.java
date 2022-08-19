package biPredicateInterface;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceDemo {

	

	public static void main(String[] args) {
		
		BiPredicate<Integer ,Integer> bipredicate=(i,j)-> i+j>=100;
		boolean test = bipredicate.test(10, 200);
		System.out.println(test);
	}
}

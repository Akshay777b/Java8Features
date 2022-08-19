package functionalInterfacePredicate;

import java.util.function.Predicate;

public class OddEvenCheckingWithPredicate {

	public static void main(String[] args) {

		Predicate<Integer> predicate = (number) -> number % 2 == 0;
		boolean test = predicate.test(110);
		System.out.println(test);
		if(test) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}

	}
}

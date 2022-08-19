package functionalInterfacePredicate;

import java.util.function.Predicate;

public class NoGreatOrNotWithPredicate {

	public static void main(String[] args) {

		Predicate<Integer> predicate = (number) -> number > 20;

		boolean test = predicate.test(12);

		if (test) {
			System.out.println("greater number");
		} else {
			System.out.println("Not greater");
		}
	}
}

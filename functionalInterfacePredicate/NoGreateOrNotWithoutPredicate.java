package functionalInterfacePredicate;

public class NoGreateOrNotWithoutPredicate {


	public boolean gretaeorNot(int number) {
		
		if(number >20) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		NoGreateOrNotWithoutPredicate greaterornot=new NoGreateOrNotWithoutPredicate();
		boolean gretaeorNot = greaterornot.gretaeorNot(15);
		if(gretaeorNot) {
			System.out.println("greater number");
		}else {
			System.out.println("Not greater");
		}
	}
}

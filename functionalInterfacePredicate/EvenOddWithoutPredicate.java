package functionalInterfacePredicate;

public class EvenOddWithoutPredicate {

public boolean oddEvenNo(int number) {
		
		if(number %2 ==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		EvenOddWithoutPredicate oddeven=new EvenOddWithoutPredicate();
		boolean oddEveNo = oddeven.oddEvenNo(11);
		if(oddEveNo) {
			System.out.println("Even no");
		}
		else {
			System.out.println("Odd no");
		}
		
		
		
	}
}

package functionalInterfacePredicate;

public class PersonNameLenghtWithoutPredicate {

	public boolean personNamelen(String name) {
		if(name.length()>=7) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		

		PersonNameLenghtWithoutPredicate  pl=new PersonNameLenghtWithoutPredicate();
	boolean personNamelen = pl.personNamelen("Sntosh");
	System.out.println(personNamelen);
}
}

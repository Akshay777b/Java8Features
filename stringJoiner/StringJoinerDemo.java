package stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	
	public static void main(String[] args) {
		
	//	StringJoiner stringJoiner = new StringJoiner(",");
		
		StringJoiner stringJoiner = new StringJoiner(",","{","}");
		
		stringJoiner.add("akshay");
		stringJoiner.add("pooja");
		stringJoiner.add("pranu");
		stringJoiner.add("akki");
		stringJoiner.add("akshada");
		System.out.println(stringJoiner);
		
		
		
	}
}

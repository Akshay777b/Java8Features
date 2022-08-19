package consumerInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo2 {

	public static void main(String[] args) {
		
		Consumer<Integer> c=  (i)-> System.out.println("Square of given no is:"+(i*i));
	       c.accept(20);
		}
}

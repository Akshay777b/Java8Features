package consumerInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {


	public static void main(String[] args) {
		
	Consumer<String> c=	(name) -> System.out.println(name + " welcome to Bikkad It");
      c.accept("Santosh");
	}
}

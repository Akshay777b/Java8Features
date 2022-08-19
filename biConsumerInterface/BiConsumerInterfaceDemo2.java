package biConsumerInterface;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceDemo2 {

	public static void main(String[] args) {
		

		
		BiConsumer<String,String> bi=	(name,vname)-> System.out.println("My name is "+name +" I am from "+vname);
			bi.accept("Akshay", "Vasmat");
		}
}

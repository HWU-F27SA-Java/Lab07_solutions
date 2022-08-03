package exercise1;

import java.util.Random;
import java.util.UUID;

public class Transport1 {

	public static void main(String[] args) {
		Random generator = new Random();
		//generate goods data
		System.out.println("Generating randomly information of merchandise");
		double weight = generator.nextDouble()*100 + 1;
		System.out.print ("Weight: " + weight);
		double volume = generator.nextDouble()*10 + 1;
		System.out.print (", Volume: " + volume);
		int expiry = generator.nextInt(30);
		System.out.println (", Expiry: " + expiry);
		
		//generate random ID
		String id = UUID.randomUUID().toString();
		
		//create Merchandise object
		Merchandise merchandise = new Merchandise(id, weight, volume, expiry);
		System.out.println(merchandise);
	}

}

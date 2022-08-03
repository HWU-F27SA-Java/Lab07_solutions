package exercise2;

import java.util.Random;
import java.util.UUID;

public class Transport2 {

	public static void main(String[] args) {
		Random generator = new Random();
		//generate data for 1st merchandise
		System.out.println("Generating randomly information of first merchandise");
		double weight1 = generator.nextDouble()*100 + 1;
		System.out.print ("Weight: " + weight1);
		double volume1 = generator.nextDouble()*10 + 1;
		System.out.print (", Volume: " + volume1);
		int expiry1 = generator.nextInt(30);
		System.out.println (", Expiry: " + expiry1);
		//generate random ID
		String id = UUID.randomUUID().toString();
		//create Merchandise object
		Merchandise merchandise1 = new Merchandise(id, weight1, volume1, expiry1);
		
		//generate data for 2nd merchandise
		System.out.println("Generating randomly information of first merchandise");
		double weight2 = generator.nextDouble()*100 + 1;
		System.out.print ("Weight: " + weight2);
		double volume2 = generator.nextDouble()*10 + 1;
		System.out.print (", Volume: " + volume2);
		int expiry2 = generator.nextInt(30);
		System.out.println (", Expiry: " + expiry2);
		//create Merchandise object
		Merchandise merchandise2 = new Merchandise(id, weight2, volume2, expiry2);
		
		System.out.println(merchandise1);
		//compare the two merchandises
		if(merchandise1.equals(merchandise2)) {
			System.out.println(" equals ");
		}else {
			System.out.println(" different from ");
		}	
		System.out.println(merchandise2);
	}

}

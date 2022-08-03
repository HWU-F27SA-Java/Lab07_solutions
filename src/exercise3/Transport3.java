package exercise3;

import java.util.Random;
import java.util.TreeSet;
import java.util.UUID;

public class Transport3 {

	public static void main(String[] args) {
		// create a TreeSet
		TreeSet<Merchandise> set1 = new TreeSet<>();

		Random generator = new Random();
		// generate data for 1st merchandise
		System.out.println("Generating randomly information of first merchandise");
		double weight1 = generator.nextDouble() * 100 + 1;
		System.out.print("Weight: " + weight1);
		double volume1 = generator.nextDouble() * 10 + 1;
		System.out.print(", Volume: " + volume1);
		int expiry1 = generator.nextInt(30);
		System.out.println(", Expiry: " + expiry1);
		// generate random ID
		String id = UUID.randomUUID().toString();
		// create Merchandise object
		Merchandise merchandise1 = new Merchandise(id, weight1, volume1, expiry1);

		// generate data for 2nd merchandise
		System.out.println("Generating randomly information of first merchandise");
		double weight2 = generator.nextDouble() * 100 + 1;
		System.out.print("Weight: " + weight2);
		double volume2 = generator.nextDouble() * 10 + 1;
		System.out.print(", Volume: " + volume2);
		int expiry2 = generator.nextInt(30);
		System.out.println(", Expiry: " + expiry2);
		// create Merchandise object
		Merchandise merchandise2 = new Merchandise(id, weight2, volume2, expiry2);

		// add the two objects set1
		set1.add(merchandise1);
		set1.add(merchandise2);
		// print out set1
		//I use the replace method to insert "new line" after each merchandise
		//this done for on screen readability only, it has no other effetct
		System.out.println(set1.toString().replace("],", "]\n").replace("]]", "]\n]"));

		// create a weight comparator
		WeightMerchandiseComparator comp = new WeightMerchandiseComparator();
		// create a second TreeSet with comparator
		TreeSet<Merchandise> set2 = new TreeSet<>(comp);
		// add the two objects to  set2
		set2.add(merchandise1);
		set2.add(merchandise2);
		// print out set2
		System.out.println(set2.toString().replace("],", "]\n").replace("]]", "]\n]"));

	}

}

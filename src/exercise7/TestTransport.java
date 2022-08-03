package exercise7;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class TestTransport {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Which shipment  Rail (0), Road (1), Sea (2), Air (3), Express road (4), Express Air(5)? ");
		int type = input.nextInt();
		System.out.println("How many goods? ");
		int nbGoods = input.nextInt();
		
		//create shipment
		Shipment shipment = ShipmentBuilder.build(type);
		shipment.setDistance(1000);
		shipment.setDuration(30);
		
		//create goods and add them to shipment
		for(int i=0; i<nbGoods; i++) {
			//generate goods data
			System.out.println("Information of " + Rank.rank(i) + " Merchandise (generate randomly for testing)");
			double weight = random.nextDouble()*100 + 1;
			System.out.print ("Weight: " + weight);
			double volume = random.nextDouble()*10 + 1;
			System.out.print (", Volume: " + volume);
			int expiry = random.nextInt(30);
			System.out.println (", Expiry: " + expiry);
			
			//generate random ID
			String id = UUID.randomUUID().toString();
			
			//create Merchandise object
			Merchandise goods = new Merchandise(id, weight, volume, expiry);
			
			//add to shipment
			shipment.add(goods);
		}
		System.out.println(shipment.toString().replace("],", "]\n").replace("]]", "]\n]"));
		
		double cost = shipment.calculateTotalCost();
		System.out.println("------------");
		System.out.println("Total cost: " + (new DecimalFormat(".00").format(cost)));
		
		input.close();
	}

}

package exercise7;
import java.util.Comparator;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadj
 */
public class Air extends Shipment{
	private final int costFactor = 10;
	private final int DISTANCE_FACTOR = 1000;

	public Air(Comparator<? super Merchandise> cmp) {
        super(cmp);
        
    }


    @Override
    public double calculateMerchandiseCost(Merchandise m) {
        return costFactor  * m.getWeight() * (distance / DISTANCE_FACTOR);
    }
    
}

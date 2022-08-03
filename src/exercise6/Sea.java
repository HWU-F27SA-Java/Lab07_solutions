package exercise6;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadj
 */
public class Sea extends Shipment{
	private final int DISTANCE_FACTOR = 5000;

    @Override
    public double calculateMerchandiseCost(Merchandise m) {
        return m.getVolume() * distance / DISTANCE_FACTOR ;
    }
    
}

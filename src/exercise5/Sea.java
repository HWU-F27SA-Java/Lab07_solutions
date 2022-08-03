package exercise5;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadj
 */
public class Sea extends Shipment{

    @Override
    public double calculateMerchandiseCost(Merchandise m) {
        return distance * m.getVolume();
    }
    
}

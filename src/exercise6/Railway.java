package exercise6;

import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadj
 */
public class Railway extends Shipment{
	private final int DISTANCE_FACTOR = 1000;

    public Railway(Comparator<? super Merchandise> cmp) {
        super(cmp);
        
    }

    @Override
    public double calculateMerchandiseCost(Merchandise m) {
        return m.getWeight() * distance / DISTANCE_FACTOR;
    }
    
}

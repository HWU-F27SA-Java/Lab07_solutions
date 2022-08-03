package exercise5;

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

    public Railway(Comparator<? super Merchandise> cmp) {
        super(cmp);
        
    }

    @Override
    public double calculateMerchandiseCost(Merchandise m) {
        return distance * m.getWeight();
    }
    
}

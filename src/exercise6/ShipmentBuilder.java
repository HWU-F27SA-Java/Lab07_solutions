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
public class ShipmentBuilder {
    public static final int RAILWAY = 0;
    public static final int ROAD = 1;
    public static final int SEA = 2;
    public static final int AIR = 3;
    public static final int EXPRESS_ROAD = 4;
    public static final int EXPRESS_AIR = 5;
    
    public static Shipment build(int type){
        Shipment g = null;
        Comparator<Merchandise> cmp ;
        switch(type){
            case RAILWAY : 
                cmp = new WeightMerchandiseComparator();
                g = new Railway(cmp);
                break;
            case ROAD :
                g = new Road();
                break;
            case SEA :
                g = new Sea();
               break;
            case AIR :
                 cmp = new WeightMerchandiseComparator();
                g = new Air(cmp);
                break;
            case EXPRESS_ROAD :
                 cmp = new WeightMerchandiseComparator();
                g = new ExpressRoad(cmp);
                break;
            case EXPRESS_AIR :
                 cmp = new WeightMerchandiseComparator();
                g = new ExpressAir(cmp);
                break;
               
        }
        return g;
    }
}

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
public class WeightMerchandiseComparator implements Comparator<Merchandise>{

    @Override
    public int compare(Merchandise t1, Merchandise t2) {
        return t1.getWeight().compareTo(t2.getWeight());
    }
    
}

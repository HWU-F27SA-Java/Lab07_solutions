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
public class ExpressAir extends Air{
	private final int costFactor = 2;
    public ExpressAir(Comparator<? super Merchandise> cmp) {
        super(cmp);
    }
    
    @Override
    public double calculateMerchandiseCost(Merchandise m){
        return super.calculateMerchandiseCost(m) * costFactor;
    }
}

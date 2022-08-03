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
public class ExpressRoad extends Road {
	private final int costFactor = 2;

	public ExpressRoad(Comparator<? super Merchandise> cmp) {
        super(cmp);
    }

    @Override
    public double calculateMerchandiseCost(Merchandise m) {
        return super.calculateMerchandiseCost(m) * costFactor;
    }
}

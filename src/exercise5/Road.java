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
public class Road extends Shipment {
	private final int costFactor = 5;

	public Road() {
		super();

	}

	public Road(Comparator<? super Merchandise> cmp) {
		super(cmp);

	}

	@Override
	public double calculateMerchandiseCost(Merchandise m) {
		return costFactor * distance * m.getWeight();
	}

}

package exercise4;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hadj
 */
public abstract class Shipment extends TreeSet<Merchandise> {

    protected int distance;
    private int duration;

    public int getDuration() {
        return duration;
    }

    public Shipment() {
        super();
    }

    public Shipment(Comparator<? super Merchandise> cmprtr) {
        super(cmprtr);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public abstract double calculateMerchandiseCost(Merchandise m);

    public double calculateTotalCost() {
        double total = 0;
        for (Merchandise m : this) {
            total += calculateMerchandiseCost(m);
        }
        return total;
    }
}

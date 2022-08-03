package exercise1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadj
 */
public class Merchandise{
    
    private String uid;
    private Double weight;
    private Double volume;
    private Integer expiry;

    public Integer getExpiry() {
        return expiry;
    }

    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    public Merchandise(String reference) {
        this.uid = reference;
    }

    public Merchandise(String uid, double weight, double volume) {
        this.uid = uid;
        this.weight = weight;
        this.volume = volume;
    }

    public Merchandise(String uid, double weight, double volume, int expiry) {
       this(uid, weight, volume);
        this.expiry = expiry;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String reference) {
        this.uid = reference;
    }

 

 
}

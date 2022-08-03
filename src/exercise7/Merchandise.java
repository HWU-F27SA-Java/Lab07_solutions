package exercise7;
import java.text.DecimalFormat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadj
 */
public class Merchandise implements Comparable<Merchandise>{
    
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

    @Override
    public int compareTo(Merchandise t) {
        return volume.compareTo(t.getVolume());
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Merchandise other = (Merchandise) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		DecimalFormat f = new DecimalFormat(".00");
		return "Merchandise [uid=" + uid + ", weight=" + f.format(weight) + 
				",\tvolume=" + f.format(volume) + ",\texpiry=" + expiry + "]";
	}

 
}

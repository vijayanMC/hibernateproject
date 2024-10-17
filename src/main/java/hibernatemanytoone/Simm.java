package hibernatemanytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Simm {
	
	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    
	private int simid;
	private String simType;
	private double simCost;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Phonep phone;

	

	public int getSimid() {
		return simid;
	}

	public void setSimid(int simid) {
		this.simid = simid;
	}

	public String getSimType() {
		return simType;
	}

	public void setSimType(String simType) {
		this.simType = simType;
	}

	public double getSimCost() {
		return simCost;
	}

	public void setSimCost(double simCost) {
		this.simCost = simCost;
	}

	public Phonep getPhone() {
		return phone;
	}

	public void setPhone(Phonep phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Simm [simid=" + simid + ", simType=" + simType + ", simCost=" + simCost + "]";
	}

}

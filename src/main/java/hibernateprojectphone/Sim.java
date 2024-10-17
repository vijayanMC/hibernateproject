package hibernateprojectphone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    
	private int simid;
	private String simType;
	private double simCost;
	
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
	public Double getSimCost() {
		return simCost;
	}
	public void setSimCost(double simCost) {
		this.simCost = simCost;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Sim [simid=" + simid + ", simType=" + simType + ", simCost=" + simCost + "]";
	}
}

package hibernateprojectphone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int phoneid;
	private String brand;
	private int ram;
	private  int storage;
	
	@OneToMany(cascade=CascadeType.ALL)
	
	private List<Sim> phoneSimCards;
	
	public int getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	public List<Sim> getPhoneSimCards() {
		return phoneSimCards;
	}
	
	public void setPhoneSimCards(List<Sim> phoneSimCards) {
		this.phoneSimCards = phoneSimCards;
	}
	@Override
	public String toString() {
		return "Phone [phoneid=" + phoneid + ", brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	

}

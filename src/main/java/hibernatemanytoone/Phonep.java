package hibernatemanytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phonep {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int phoneid;
	private String brand;
	private int ram;
	private  int storage;
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
	@Override
	public String toString() {
		return "Phonep [phoneid=" + phoneid + ", brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	
	

}

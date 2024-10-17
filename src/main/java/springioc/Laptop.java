package springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    
	@Value("1")
	private int lapid;
	
	@Value("12")
	private int lapram;
	
	@Value("apple")
	private String lapbrand;
	
	@Autowired
	private User user;

//	public Laptop(int lapid, int lapram, String lapbrand, User user) {
//		super();
//		this.lapid = lapid;
//		this.lapram = lapram;
//		this.lapbrand = lapbrand;
//		this.user = user;
//	}

	public int getLapid() {
		return lapid;
	}

	public void setLapid(int lapid) {
		this.lapid = lapid;
	}

	public int getLapram() {
		return lapram;
	}

	public void setLapram(int lapram) {
		this.lapram = lapram;
	}

	public String getLapbrand() {
		return lapbrand;
	}

	public void setLapbrand(String lapbrand) {
		this.lapbrand = lapbrand;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", lapram=" + lapram + ", lapbrand=" + lapbrand + ", user=" + user + "]";
	}
	
	
	 
}

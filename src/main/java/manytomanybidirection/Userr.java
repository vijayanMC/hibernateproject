package manytomanybidirection;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Userr {
    
	@Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String email;
	 
	 @ManyToMany(cascade=CascadeType.ALL)
	 
	 List<Application> apps;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Application> getApps() {
		return apps;
	}

	public void setApps(List<Application> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "Userr [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	 
	 
}

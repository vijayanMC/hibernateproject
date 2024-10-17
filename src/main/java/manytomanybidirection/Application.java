package manytomanybidirection;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Application {
	@Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private int cost;
	 
	 @ManyToMany(cascade=CascadeType.ALL)
	 
	 List<Userr> users;

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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<Userr> getUsers() {
		return users;
	}

	public void setUsers(List<Userr> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Application [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}

	

	
		
	}
	 
	 


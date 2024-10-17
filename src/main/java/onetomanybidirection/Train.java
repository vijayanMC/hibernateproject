package onetomanybidirection;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Train {
      
	 @Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	 private int id;
	 private int trainno;
	 private int noofcoaches;
	 
	 @OneToMany(cascade=CascadeType.ALL)
	 
	 private List<Passenger> passenger;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainno() {
		return trainno;
	}

	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}

	public int getNoofcoaches() {
		return noofcoaches;
	}

	public void setNoofcoaches(int noofcoaches) {
		this.noofcoaches = noofcoaches;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", trainno=" + trainno + ", noofcoaches=" + noofcoaches + ", passenger=" + passenger
				+ "]";
	}
	 
	 
	 
}

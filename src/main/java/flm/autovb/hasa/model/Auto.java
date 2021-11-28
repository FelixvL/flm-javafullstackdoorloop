package flm.autovb.hasa.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String merk;
	private String nummerbord;
	private int snelheid;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getNummerbord() {
		return nummerbord;
	}
	public void setNummerbord(String nummerbord) {
		this.nummerbord = nummerbord;
	}
	public int getSnelheid() {
		return snelheid;
	}
	public void setSnelheid(int snelheid) {
		this.snelheid = snelheid;
	}
	
	

}

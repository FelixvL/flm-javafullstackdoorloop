package flm.autovb.hasa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Huis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String straat;
	private int huisNummer;
	
	//private int personId;  // ORM
	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {   // deze naam veranderen
		return straat;
	}

	public void setStreet(String straat) {
		this.straat = straat;
	}
	
	

}

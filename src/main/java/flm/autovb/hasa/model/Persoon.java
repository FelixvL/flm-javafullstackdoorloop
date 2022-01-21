package flm.autovb.hasa.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//  json naam van de getters en setters
//  eenrichtingrelatie voor relatie oneToOne
//        andere kant   GEEN verschil
//   een richtingrelatie voor oneToMany
		// wel verschil koppeltabel

// Een object aan een ander object toevoegen via een post op het endpoint


// twee nieuwe objecten
// 1 bestaand object en 1 nieuwe
// 1 bestaand object en 1 bestaand object



@Entity
public class Persoon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String voornaam;
	private String achternaam;
	private LocalDate geboortedatum;
	
	@ManyToMany
	private List<Huis> huis;
	
	
	
	
	
	
	
	public List<Huis> getHuis() {
		return huis;
	}
	public void setHuis(List<Huis> huis) {
		this.huis = huis;
	}
	@ManyToOne
	private Auto wagen;
	
	
	public Auto getWagen() {
		return wagen;
	}
	public void setWagen(Auto wagen) {
		this.wagen = wagen;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public LocalDate getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(LocalDate geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	
	

}

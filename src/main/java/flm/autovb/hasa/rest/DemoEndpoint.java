package flm.autovb.hasa.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flm.autovb.hasa.model.Persoon;

@RestController
public class DemoEndpoint {
	
	@GetMapping("/startmethuiskopen")
	public void test() {
		System.out.println("test");
	}
	@GetMapping("/startmethuiskopen/{voorbeeld}")
	public String tweedeMethode(@PathVariable String voorbeeld) {
		System.out.println("test"+voorbeeld);
		return "het is gelukt";
	}
	@PostMapping("/startmethuiskopen")
	public String derdeMethode() {

		return "in de post";
	}
	@PostMapping("/maakeenmensaan")
	public String derdeMethode(@RequestBody Persoon p) {
		System.out.println(p.getAchternaam());
		System.out.println(p.getVoornaam());
		return "in de post";
	}
	@GetMapping("/maakeenmensaan")
	public Persoon derdeMethodeAnders() {
		Persoon p = new Persoon();
		p.setAchternaam("johansen");
		p.setVoornaam("karin");
		return p;
	}

}

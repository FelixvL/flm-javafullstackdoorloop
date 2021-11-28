package flm.autovb.hasa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import flm.autovb.hasa.model.Auto;
import flm.autovb.hasa.model.Persoon;
import flm.autovb.hasa.persistance.PersoonService;

@RestController
public class PersoonEndpoint {
	@Autowired
	private PersoonService ps;
	
	
	//persoon nieuw auto nieuw
	@GetMapping("toevoegennieuwnieuw/{voornaam}/{merk}")
	public void slaAutoEnPersoonOp(@PathVariable String voornaam, @PathVariable String merk) {
		Persoon persoon = new Persoon();
		persoon.setVoornaam(voornaam);
		Auto auto = new Auto();
		auto.setMerk(merk);
		ps.slaDezePersoonEnAutoOp(persoon, auto);
	}
	
	//persoon db  auto nieuw
	
	//persoon db  auto db
	
	
	
	
	
	
	
	
	@GetMapping("/test/{tekst}/{andere}")
	public void testmethode(@PathVariable String tekst,@PathVariable String andere, @RequestParam int eenvar) {
		System.out.println("test:" + tekst+andere+eenvar);
		ps.slaPersoonOp();
	}
	@PostMapping("/test2")
	public void testPostMethode(@RequestBody Persoon persoon) {
		System.out.println(persoon.getAchternaam());
		ps.slaDezePersoonOp(persoon);
		
	}
}

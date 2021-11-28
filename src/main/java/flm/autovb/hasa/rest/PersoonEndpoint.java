package flm.autovb.hasa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import flm.autovb.hasa.persistance.PersoonService;

@RestController
public class PersoonEndpoint {
	@Autowired
	private PersoonService ps;
	
	@GetMapping("/test")
	public void testmethode() {
		System.out.println("test");
		ps.slaPersoonOp();
	}
}

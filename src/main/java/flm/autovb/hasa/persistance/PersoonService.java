package flm.autovb.hasa.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flm.autovb.hasa.model.Persoon;
import flm.autovb.hasa.model.Auto;
@Service
public class PersoonService {
	
	@Autowired
	private PersoonRepository pr;
	
	@Autowired 
	private AutoRepository ar;
	
	public Iterable<Persoon> eigenMethode() {
		return pr.hoi();
	}
	
	public void slaPersoonOp() {
		pr.save(new Persoon());
	}
	public void slaDezePersoonOp(Persoon p) {
		pr.save(p);
	}
	public void slaDezePersoonEnAutoOp(Persoon p, Auto a) {
		ar.save(a);
		p.setWagen(a);
		pr.save(p);
		
	}

}

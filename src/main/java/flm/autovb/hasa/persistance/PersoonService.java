package flm.autovb.hasa.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flm.autovb.hasa.model.Persoon;

@Service
public class PersoonService {
	
	@Autowired
	private PersoonRepository pr;
	
	
	public void slaPersoonOp() {
		pr.save(new Persoon());
	}

}

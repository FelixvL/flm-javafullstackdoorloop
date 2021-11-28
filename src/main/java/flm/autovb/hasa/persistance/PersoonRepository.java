package flm.autovb.hasa.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import flm.autovb.hasa.model.Persoon;

@Component
public interface PersoonRepository extends CrudRepository<Persoon, Long>{

}

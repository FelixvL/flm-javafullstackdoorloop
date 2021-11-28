package flm.autovb.hasa.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import flm.autovb.hasa.model.Auto;

@Component
public interface AutoRepository extends CrudRepository<Auto, Long>{

}

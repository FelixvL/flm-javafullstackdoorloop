package flm.autovb.hasa.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import flm.autovb.hasa.model.Persoon;

// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference

@Component
public interface PersoonRepository extends CrudRepository<Persoon, Long>{
	List<Persoon> findPersoonsByVoornaam(String voornaam);
	
	@Query(value="SELECT * FROM Persoon", nativeQuery=true)
	List<Persoon> hoi();
}

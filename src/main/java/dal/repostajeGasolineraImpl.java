package dal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class repostajeGasolineraImpl implements repostajeGasolineraServicio {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertarRepostajeNormal(repostajeGasolinera repostaje) {
		em.persist(repostaje);
		
	}
	

}

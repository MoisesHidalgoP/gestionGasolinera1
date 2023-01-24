package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class repostajeGasolineraImpl implements repostajeGasolineraServicio {
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public void insertarRepostajeNormal(repostajeGasolinera repostaje) {
		em.persist(repostaje);
		
	}

    @Override
	public List<repostajeGasolinera> verLlenadoDeposito() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT repostaje FROM repostajeGasolinera repostaje").getResultList();
	}
    @Override
	public void llenarDeposito(repostajeGasolinera repostajeGasolinera) {
		// TODO Auto-generated method stub
		em.persist(repostajeGasolinera);
		
	}
    @Override
	public List<repostajeGasolinera> buscarTodosRepostajes() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT Repostaje FROM repostajeGasolinera Repostaje").getResultList();
	}
	

}

package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class repostajeVehiculoImpl implements repostajeVehiculoServicio{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void repostajeVehiculo(repostajeVehiculo repostaje) {
		em.persist(repostaje);
		
	}

	@Override
	public List<repostajeVehiculo> buscarTodosRepostajes() {
        return em.createQuery("SELECT Repostaje FROM repostajeVehiculo Repostaje").getResultList();
        
	}

	@Override
	public List<repostajeVehiculo> importeTotalCombustible() {
		
		return (List<dal.repostajeVehiculo>) em.createQuery("SELECT repostajeVehiculo.importe FROM repostajeVehiculo Repostaje").getParameter("importe");
	}
	
	

	


}

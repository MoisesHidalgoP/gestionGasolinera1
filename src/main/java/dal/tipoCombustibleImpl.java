package dal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class tipoCombustibleImpl implements tipoCombustibleServicio {
	
	@PersistenceContext
	private EntityManager em;

}

package br.com.filmeapp.DAO;

import java.util.List;

import br.com.filmeapp.model.Filme;
import br.com.filmeapp.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class DashDAO {
	
	public DashDAO() {
        this.em = JPAUtil.getEntityManager();
    }
	
	 @PersistenceContext(unitName = "filmePU")
	    private EntityManager em;

	    public List<Filme> listarTop3Melhores() {
	    	return em.createQuery("SELECT f FROM Filme f ORDER BY f.nota DESC", Filme.class)
	                .setMaxResults(3)
	                .getResultList();
	    }

		public List<Filme> listarTop3Piores() {
			return em.createQuery("SELECT f FROM Filme f ORDER BY f.nota ASC", Filme.class)
	                .setMaxResults(3)
	                .getResultList();
		}

}

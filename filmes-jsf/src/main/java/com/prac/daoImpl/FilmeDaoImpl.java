package com.prac.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.prac.dao.FilmeDao;
import com.prac.vo.Filme;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;


public class FilmeDaoImpl implements FilmeDao {
	
	private EntityManager em;

    public FilmeDaoImpl(EntityManager em) {
        this.em = em;
    }
    
	@Override
	public List<Filme> getFilmes() {
		
		  return em.createQuery("SELECT f FROM Filme f", Filme.class).getResultList();
	}
	
	@Override
	public List<Filme> adicionarFilme(Filme filme) {
	        List<Filme> lista = new ArrayList<>();

	        try {
	            EntityTransaction tx = em.getTransaction();
	            
	            em.persist(filme);

	            // Buscar todos os filmes após inserção
	            TypedQuery<Filme> query = em.createQuery("SELECT f FROM Filme f", Filme.class);
	            lista = query.getResultList();

	            tx.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	            if (em.getTransaction().isActive()) {
	                em.getTransaction().rollback();
	            }
	        }

	        return lista;
	    }

}

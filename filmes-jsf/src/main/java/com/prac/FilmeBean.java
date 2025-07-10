package com.prac;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.prac.daoImpl.FilmeDaoImpl;
import com.prac.util.JPAUtil;
import com.prac.vo.Filme;

import jakarta.persistence.EntityManager;

@ManagedBean(name = "filmeBean")
@ViewScoped
public class FilmeBean implements Serializable {

    private List<Filme> filmes;
    private Filme novoFilme = new Filme();

    public FilmeBean() {
        System.out.println("FilmeBean construtor chamado!");
    }

    public List<Filme> getFilmes() {
    	System.out.println("FilmeBean GETFILMES chamado!");
        if (filmes == null) {
            EntityManager em = null;
            try {
                em = JPAUtil.getEntityManager();
                em.getTransaction().begin();
                FilmeDaoImpl dao = new FilmeDaoImpl(em);
                filmes = dao.getFilmes();
                System.out.println("Filmes carregados: " + filmes.size());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        }
        return filmes;
    }
    
    // Novo método para inserir um filme
    public void inserirFilme() {
        EntityManager em = null;
        try {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();
            FilmeDaoImpl dao = new FilmeDaoImpl(em);
            
            dao.adicionarFilme(novoFilme);
            System.out.println("Filme inserido com sucesso: " + novoFilme.getNome());
            filmes = null; // força atualização da lista na próxima chamada
            novoFilme = new Filme(); // limpa o formulário
        } catch (Exception e) {
            e.printStackTrace();
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
    

    // Getter e Setter do novoFilme
    public Filme getNovoFilme() {
        return novoFilme;
    }

    public void setNovoFilme(Filme novoFilme) {
        this.novoFilme = novoFilme;
    }
    
}

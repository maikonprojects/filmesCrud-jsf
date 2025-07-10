package com.prac.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Filme {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String nome;
    private Double nota;
    private String urlPoster;

    public Filme(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    
    public String getUrlPoster() {
        return urlPoster;
    }
    
    public Double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setUrlPoster(String urlPoster) {
        this.urlPoster = urlPoster;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    public Filme() {}

	public Filme(String nomeFilme, Double notaFilme, String poster) {
		this.nome = nomeFilme;
		this.urlPoster = poster;
		this.nota = notaFilme;
	}

	public Filme(String nomeFilme, Double notaFilme) {
		this.nome = nomeFilme;
		this.nota = notaFilme;
	}
    
    
}

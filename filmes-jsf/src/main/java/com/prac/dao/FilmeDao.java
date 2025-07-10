package com.prac.dao;

import java.util.List;

import com.prac.vo.Filme;


public interface FilmeDao {
	public List<Filme> getFilmes();

	public List<Filme> adicionarFilme(Filme filme);
}

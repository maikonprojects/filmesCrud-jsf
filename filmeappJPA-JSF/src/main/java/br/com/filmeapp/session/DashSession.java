package br.com.filmeapp.session;

import java.util.List;

import br.com.filmeapp.DAO.DashDAO;
import br.com.filmeapp.model.Filme;

public class DashSession {
	private final DashDAO dao = new DashDAO();

	public List<Filme> listarTop3Melhores() {
		
		return dao.listarTop3Melhores();
		
	}

	public List<Filme> listarTop3Piores() {
		return dao.listarTop3Piores();
	}
}

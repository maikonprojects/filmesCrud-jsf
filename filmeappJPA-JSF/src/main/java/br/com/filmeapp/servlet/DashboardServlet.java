package br.com.filmeapp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmeapp.model.Filme;
import br.com.filmeapp.session.DashSession;
import br.com.filmeapp.session.FilmeSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	
	  private final DashSession session = new DashSession();
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	
    	List<Filme> lista = session.listarTop3Melhores();
    	List<Filme> listaTop3Piores = session.listarTop3Piores();
    	
        request.setAttribute("top3", lista);
        request.setAttribute("top3Piores", listaTop3Piores);
        request.getRequestDispatcher("dash.jsp").forward(request, response);
        
    }
}
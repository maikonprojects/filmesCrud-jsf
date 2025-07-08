package br.com.filmeapp.session;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import br.com.filmeapp.DAO.FilmesDAO;
import br.com.filmeapp.model.Filme;

public class FilmeSession {
	
	private final FilmesDAO dao = new FilmesDAO();

	public List<Filme> listar() {
		
		return dao.listarFilmes();
		
	}

	public void deletar(int idFilme) {
		
		dao.removerFilme(idFilme);
		
	}

	public void inserir(String nomeFilme, Double notaFilme) {
	    String apiKey = "6dffec4e"; // cadastre-se em http://www.omdbapi.com/apikey.aspx
	    String query = nomeFilme.replace(" ", "+");
	    String apiUrl = "http://www.omdbapi.com/?t=" + query + "&r=xml&apikey=" + apiKey;

	    if(notaFilme < 0 )
	    
	    try {
	        URL url = new URL(apiUrl);
	        HttpURLConnection con = (HttpURLConnection) url.openConnection();
	        con.setRequestMethod("GET");

	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder builder = factory.newDocumentBuilder();
	        Document doc = builder.parse(con.getInputStream());

	        NodeList list = doc.getElementsByTagName("movie");

	        if (list.getLength() > 0) {
	            Element movieElement = (Element) list.item(0);

	            String titulo = movieElement.getAttribute("title");
	            String poster = movieElement.getAttribute("poster");

	         
	            System.out.println("✅ POSTER: " + poster);
	            // Agora salva com os dados da API
	            dao.adicionarFilme(new Filme(nomeFilme, notaFilme, poster));
	        } else {
	            // Fallback se não encontrou
	        	String posterFall = "https://camo.githubusercontent.com/e7260310f5d1a8a9473a908e039f348a459078b0ba1876d12fbe0a26c8a0e1a7/68747470733a2f2f7a7562652e696f2f66696c65732f706f722d756d612d626f612d63617573612f33363664616462316461323032353338616531333332396261333464393030362d696d6167652e706e67";
	            dao.adicionarFilme(new Filme(nomeFilme, notaFilme, posterFall));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        String posterFall = "https://camo.githubusercontent.com/e7260310f5d1a8a9473a908e039f348a459078b0ba1876d12fbe0a26c8a0e1a7/68747470733a2f2f7a7562652e696f2f66696c65732f706f722d756d612d626f612d63617573612f33363664616462316461323032353338616531333332396261333464393030362d696d6167652e706e67";
	        dao.adicionarFilme(new Filme(nomeFilme, notaFilme, posterFall));
	    }
	}


	public void editarFilme(int idFilme, Filme filme) {
		System.out.println("✅ SESSION");
		dao.editarFilme(idFilme, filme);
		
	}
	
		

}

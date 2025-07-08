<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="br.com.filmeapp.model.Filme" %>
<html>
<link rel="stylesheet" href="css/dash.css">
<body>
    <h1>DashBoard:</h1>
    
    <a href="filmes">Voltar</a>
    
    
<div class="container-pai">

	<div>
			<h1>Top 3 melhores filmes da sua lista</h1>
		<div>
			<table>
			    <thead>
			        <tr>
			            <th>Nome</th>
			            <th>Nota</th>
			        </tr>
			    </thead>
			 
			    <tbody>
			        <%
			            List<Filme> filmes = (List<Filme>) request.getAttribute("top3");
			            if (filmes != null) {
			                for (Filme f : filmes) {
			        %>
			        <tr>
			            <td><%= f.getNome() %></td>
			            <td><%= f.getNota() %></td>
			           
			        </tr>
			        <%
			                }
			            }
			        %>
			    </tbody>
			</table>
		</div>
	

	</div>
	
	<div>
			<h1>Piores 3 filmes da sua lista</h1>
		<div>
			<table>
			    <thead>
			        <tr>
			            <th>Nome</th>
			            <th>Nota</th>
			        </tr>
			    </thead>
			 
			    <tbody>
			        <%
			            List<Filme> top3Piores = (List<Filme>) request.getAttribute("top3Piores");
			            if (top3Piores != null) {
			                for (Filme f : top3Piores) {
			        %>
			        <tr>
			            <td><%= f.getNome() %></td>
			            <td><%= f.getNota() %></td>
			           
			        </tr>
			        <%
			                }
			            }
			        %>
			    </tbody>
			</table>
		</div>
	

	</div>
	
</div>
</body>
</html>

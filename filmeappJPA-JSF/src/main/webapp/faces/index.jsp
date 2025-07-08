<!-- src/main/webapp/index.jsp -->

<%@ page import="java.util.List" %>
<%@ page import="br.com.filmeapp.model.Filme" %>

<html>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<body>

		<div class="panel panel-default">
			<div class="panel-heading"><h3 class="panel-title"><i class="fa fa-table" aria-hidden="true"></i>&#160;Data table</h3></div>
			<h:dataTable styleClass="table table-striped"
				value="#{helloBean.elementSources.employeeList}" var="employee">
				<h:column>
					<f:facet name="header">Emp no</f:facet>#{employee.empNum}
		</h:column>
				<h:column>
					<f:facet name="header">Emp name</f:facet>#{employee.empName}
		</h:column>
				<h:column>
					<f:facet name="header">Dept</f:facet>#{employee.dept}
		</h:column>
				<h:column>
					<f:facet name="header">Role</f:facet>#{employee.role}
		</h:column>
				<h:column>
					<f:facet name="header">Age</f:facet>#{employee.age}
		</h:column>
				<h:column>
					<f:facet name="header">Salary</f:facet>#{employee.sal}
		</h:column>
			</h:dataTable>
		</div>
    
</body>
</html>



<script>
    // Abrir o modal e preencher os dados
    document.querySelectorAll(".edit-btn").forEach(btn => {
        btn.addEventListener("click", () => {
            const modal = document.getElementById("editModal");
            document.getElementById("modalIdFilme").value = btn.dataset.id;
            document.getElementById("modalNomeFilme").value = btn.dataset.nome;
            document.getElementById("modalNotaFilme").value = btn.dataset.nota;
            modal.style.display = "block";
        });
    });
    
 // Abrir o modal post
    document.querySelectorAll(".post-btn").forEach(btn => {
        btn.addEventListener("click", () => {
            const modal = document.getElementById("postModal");
            
            modal.style.display = "block";
        });
    });
 
    document.querySelectorAll(".post-nota-btn").forEach(btn => {
        btn.addEventListener("click", () => {
            const modal = document.getElementById("postNotaModal");
            
            modal.style.display = "block";
        });
    });

    // Fechar o modal put
    document.querySelector(".close-modal").onclick = function () {
        document.getElementById("editModal").style.display = "none";
    }
    
 	// Fechar o modal post
    document.querySelector(".close-modal-post").onclick = function () {
        document.getElementById("postModal").style.display = "none";
    }

 // Fechar o modal post
    document.querySelector(".close-modal-post-nota").onclick = function () {
        document.getElementById("postNotaModal").style.display = "none";
    }

</script>


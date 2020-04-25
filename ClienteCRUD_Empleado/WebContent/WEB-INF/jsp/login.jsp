<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Empleados</title>

	<style>
        #formdiv {
            margin:auto;
            width: 20%;
            border: 1px solid #73AD21;
            padding: 80px;
        }
        
        div.contenedor {
  width: 90%;
  display: flex;
  justify-content: center
}
        
    </style>

</head>
<body>
<div id="formdiv">
<div class="contenedor">
	<h2>Acceder</h2>
</div>

		<form:form method="post" modelAttribute="empleado" action="login" class="ui-float-label" id="frm">
			<div class="header">
				<h3> Sistema de Empleados </h3>
			</div>
			<div class="sep"> </div>
			<div class="inputs">
			<br>
			<h4>ID</h4>
			<form:input type="number" name="numeroid"  path="numeroid" /> 
			<br> 
			<br>
			<h4>Nombre</h4>
			<form:input type="text" name = "nombre"  path="nombre" />
			<br>
			<br> 
			<a>  <input id="submit" type="submit" value="Entrar" name="login"> 
			</a> 
			<br>  
			<br> 
			YA TIENES CUENTA ? <a href="http://localhost:8081/ClienteCRUD_Empleado/registro"> REGISTRATE </a>	
			</div>
		</form:form>
		</div>			
</body>
</html>
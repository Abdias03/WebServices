<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UPDATE</title>

<style>
#formdiv {
	margin: auto;
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
		<h3> ACTUALIZAR </h3>
		<div class="contenedor">
		<form:form class="ui-float-label" id="frm" method="post" modelAttribute="empleado" action="update">
			NumeroID: <form:input type="number" name="numeroid" path="numeroid" placeholder="${empleado.getNumeroid()}"/> <br>
			Nombre: <form:input type="text" name="nombre" path="nombre" placeholder="${empleado.getNombre()}" /> <br>
			Edad: <form:input type="text" name="edad" path="edad" placeholder="${empleado.getEdad()}"/> <br>
			Departamento: <form:input type="text" name="departamento" path="departamento" placeholder="${empleado.getDepartamento()}" /> <br>
			<br>
			<a> <input id="submit" type="submit" value="Registrar" name="registro"> </a>
		</form:form>
		</div>
	</div>
</body>
</html>
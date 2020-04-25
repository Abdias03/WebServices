<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BIENVENIDA</title>
</head>
<body>
	<form:form method="post" action="update">
		BIENVENIDO:<FONT COLOR="blue"> ${empleado.getNombre()} </FONT> <br>
		<input id="submit" type="submit" value="Actualizar" name="update">	
    </form:form>
    
    <form:form method="post" action="delete">
		<input id="submit" type="submit" value="Borrar" name="delete">	
    </form:form>
    
</body>
</html>
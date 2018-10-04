<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>VOUS ETES CONNECTE </h1>

<%-- Client ${CleClient.nom} --%>

<c:forEach var="element" items="${CleClient}">
	
	User "${element.prenom}" <br />
	
<%-- 	<a href="ServletAccesDB?id=${element.nom}"> voir la fiche</a>. --%>

	</c:forEach>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="CSS1.css" />
<head>
<meta charset="ISO-8859-1">
<title>Home ProxybanqueCOBT</title>
</head>
<body>
		<table>

			<td><img src="images/proxibanque.png" alt="Nouveau !" /></td>
			<td>PROXIBANQUE</td>
		</table>
		
	<h1>VOUS ETES CONNECTE</h1>

	<h3>Listes des Clients</h3>
	<table>
		<tr>
			<th>Prenom</th>
			<th>Nom</th>
			<th>Fiche client</th>
			<th>Editer</th>
			<th>Virement</th>
		</tr>

		<c:forEach var="element" items="${CleClient}">
			<tr>
				<td>${element.prenom}</td>
				<td>${element.nom}</td>
				<td> <a href="ServletFicheClient?id=${element.idClient}"> voir fiche</a></td>
				<td><a href="ServletEdition?id=${element.idClient}"> Editer</a></td>
				<td>Virement</td>
			</tr>
		</c:forEach>
		
		


	</table>
</body>
</html>
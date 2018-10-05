<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="CSS1.css" />
<head>
<meta charset="ISO-8859-1">
<title>Edition Client</title>
</head>
<body>
	<table>

		<td><img src="images/proxibanque.png" alt="Nouveau !" /></td>
		<td>PROXIBANQUE</td>
	</table>

	<h1>Editer le client : ${detailClient.prenom} ${detailClient.nom}
	</h1>

	<form method="post" action="ServletEdition">
		<p>iD Client :</p>
		<input name="id" value="${detailClient.idClient}">
		<p>
			Prenom : <input name="prenom" value="${detailClient.prenom}">
		<p>
			Nom : <input name="nom" value="${detailClient.nom}">
		<p>
			Email : <input name="email" value="${detailClient.email}">
		<p>
			Adresse : <input name="adresse" value="${detailClient.adresse}">
		<p>Solde Compte Courant : ${detailClient.soldeCompteCourant} euros
		
		<p>
			Solde Compte Epargne : ${detailClient.soldeCompteEpargne} euros

			<%-- <c:set property="${detailClient.email}"> <input name="email" value="${detailClient.email}" type="${editClient.email}"> </c:set> --%>

			<br /> <br /> 
		<table>
			<tr>

				<td><a href="accueil.jsp">

						<h3>Retour Accueil</h3>

				</a></td>

				<td></td>

				<td></td>

				<td></td>

				<td></td>

				<td></td>

				<td><input type="submit" value="Valider modif"
				style="background-color: green; border: 1px solid black" /></td>
			</tr>
		</table>

	</form>

</body>
</html>
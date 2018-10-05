<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="CSS1.css" />
<head>
<meta charset="ISO-8859-1">
<title>Fiche Client</title>
</head>
<body>

	<table>

		<td><img src="images/proxibanque.png" alt="Nouveau !" /></td>
		<td>PROXIBANQUE</td>
	</table>

	<h1>Fiche de ${detailClient.prenom} ${detailClient.nom}</h1>

	<p>iD Client : ${detailClient.idClient}
	<p>Prenom : ${detailClient.prenom}
	<p>Nom : ${detailClient.nom}
	<p>Email : ${detailClient.email}
	<p>Adresse : ${detailClient.adresse}
	<p>Solde Compte Courant : ${detailClient.soldeCompteCourant} euros
	
	<p>
		Solde Compte Epargne : ${detailClient.soldeCompteEpargne} euros 
		
		<br/>
		<a
			href="accueil.jsp">

			<h3>Retour Accueil</h3> </a>
</body>
</html>
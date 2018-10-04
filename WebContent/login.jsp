<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="post" action="ServletConnexion">

		<h1>Veuillez vous connecter</h1>
		<fieldset>
			<legend>Connexion</legend>
			<div>
				<br />Login : <input name="login"> <br />
				<br />Password : <input name="password" type="password"> <br/>
			</div>
		</fieldset>

		<br /> <input type="reset" value="Reset" style="background-color:red; border: 1px solid black"/> <input type="submit"
			value="Envoyer" style="background-color:green; border: 1px solid black"/>
	</form>
	
</body>
</html>
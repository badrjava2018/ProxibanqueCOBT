package model;

/**
 * 
 * @author Adminl
 *Classe qui nous permet d'avoir tous les getters et les setters pour les information du client, les attribus correspondent à ceux de la BDD MySQL
 *
 */

public class Client {

	private Integer idClient;
	private String prenom;
	private String nom;
	private String email;
	private String adresse;
	private double soldeCompteCourant;
	private double soldeCompteEpargne;
	



	
	
	public Client(String prenom, String nom, String email, String adresse, double soldeCompteCourant,
			double soldeCompteEpargne) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.soldeCompteCourant = soldeCompteCourant;
		this.soldeCompteEpargne = soldeCompteEpargne;
	}



	public Client(Integer idClient) {
		super();
		this.idClient = idClient;
	}



	public Client() {
		super();
	}

	
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;


	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}



	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email=" + email + "]";
	}

	public Double getSoldeCompteCourant() {
		return soldeCompteCourant;
	}

	public void setSoldeCompteCourant(double soldeCompteCourant) {
		this.soldeCompteCourant = soldeCompteCourant;
	}

	public double getSoldeCompteEpargne() {
		return soldeCompteEpargne;
	}

	public void setSoldeCompteEpargne(double soldeCompteEpargne) {
		this.soldeCompteEpargne = soldeCompteEpargne;
	}




	

}

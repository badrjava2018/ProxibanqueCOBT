package model;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private Integer idClient;

	private List<CompteBancaire> comptesClient = new ArrayList<>();

	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		setIdClient(10000 + (int) (Math.random() * 10000)); // alea entre 10000 et 20000

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

	public List<CompteBancaire> getComptesClient() {
		return comptesClient;
	}

	public void setComptesClient(List<CompteBancaire> comptesClient) {
		this.comptesClient = comptesClient;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email=" + email + "]";
	}

	

}

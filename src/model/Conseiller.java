package model;

import java.util.ArrayList;
import java.util.List;

public class Conseiller {

	private String nom;
	private String prenom;
	private Integer idConseiller;

	private List<Client> listClient = new ArrayList<>();

	public Conseiller(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		// this.idConseiller = 2000;
		// this.setIdConseiller(2000);

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

	public Integer getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Integer idConseiller) {
		this.idConseiller = idConseiller;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	@Override
	public String toString() {
		return "Conseiller [nom=" + nom + ", prenom=" + prenom + ", idConseiller=" + idConseiller + "]";
	}

}

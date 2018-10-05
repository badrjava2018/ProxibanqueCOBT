package model;

/**
 * 
 * @author Adminl
 *Classe Conseiller, creer dans le cas où ont souhaite creer une base de données pour les Conseiller et leur donner un login et mot de passe différent
 */
public class Conseiller {

	private Integer idConseiller;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	
	


	public Conseiller(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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


	@Override
	public String toString() {
		return "Conseiller [nom=" + nom + ", prenom=" + prenom + ", idConseiller=" + idConseiller + "]";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

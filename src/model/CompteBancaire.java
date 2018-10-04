package model;

/**
 * @author Adminl
 *CETTE CLASSE ABSTRITE GERE L ESSENTIEL DES FONCTIONNALITES D UN COMPTE BANCAIRE,
 *On ne peut pas l'instancier. 
 */
public abstract class CompteBancaire {

	private int idCompte;
	private double solde;
	private String date;
	private int idClientProprietaire;
	private String typeCompte;

	public CompteBancaire() {
		setIdCompte(20000 + (int) (Math.random() * 20000));
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
//		if (getTypeCompte().equals(CompteEpargne.getEpargne()) && solde >= 0)
//			this.solde = solde;
//		if (getTypeCompte().equals(CompteCourant.getCourant()) && solde >= -1000)
			this.solde = solde;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getIdClientProprietaire() {
		return idClientProprietaire;
	}

	public void setIdClientProprietaire(int idClientProprietaire) {
		this.idClientProprietaire = idClientProprietaire;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public String toString() {
		return "CompteBancaire [idCompte=" + idCompte + ", solde=" + solde + ", date=" + date + "]";
	}

}

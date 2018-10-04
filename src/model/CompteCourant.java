package model;


public class CompteCourant extends CompteBancaire {

	private static final String COURANT = "COURANT";

	@Override
	public void setTypeCompte(String COURANT) {

		super.setTypeCompte(COURANT);
	}

	public static String getCourant() {
		return COURANT;
	}

	@Override
	public String toString() {
		return "CompteCourant [getIdCompte()=" + getIdCompte() + ", getSolde()=" + getSolde() + ", getDate()="
				+ getDate() + ", getIdClientProprietaire()=" + getIdClientProprietaire() + ", getTypeCompte()="
				+ getTypeCompte() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

}

package model;

/**
 * @author Adminl CETTE CLASSE GERE L INSTANCIATION D UN COMPTE BANCAIRE
 *         EPARGNE, ET ETEND LA CLASSE ABSTRITE CompteBancaire. On a utilise
 *         private static final String pour la discriminer.
 */
public class CompteEpargne extends CompteBancaire {

	private double txRem = 0.03;
	private static final String EPARGNE = "EPARGNE";

	public CompteEpargne() {
		setTypeCompte(EPARGNE);
	}

	public double getTxRem() {
		return txRem;
	}

	public void setTxRem(double txRem) {
		this.txRem = txRem;
	}

	@Override
	public void setTypeCompte(String EPARGNE) {

		super.setTypeCompte(EPARGNE);
	}

	public static String getEpargne() {
		return EPARGNE;
	}

	@Override
	public String toString() {
		return "CompteEpargne [txRem=" + txRem + ", getIdCompte()=" + getIdCompte() + ", getSolde()=" + getSolde()
				+ "]";
	}

}

package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.MyBusinessException;
import model.Client;
/**
 * 
 * @author Adminl
 *
 *Classe d'implementation des methodes de la CustomerDao qui etant la classe abstraite AbstractDaoJdbc
 *
 */
public class CustomerDaoImpl extends AbstractDaoJdbc implements CustomerDao {

	// Find by id OK
	@Override
	public Client findById(int id) throws MyBusinessException {
		Client cust = null;
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			cn = getConnectionDM();

			String sql = "select prenom, nom, email, idClient, adresse, soldeCompteCourant, soldeCompteEpargne from client where idClient = ?";

			st = cn.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();

			if (rs.next()) {
				cust = new Client();

				cust.setPrenom(rs.getString("prenom"));
				cust.setNom(rs.getString("nom"));
				cust.setEmail(rs.getString("email"));
				cust.setIdClient(rs.getInt("idClient"));
				cust.setAdresse(rs.getString("adresse"));
				cust.setSoldeCompteCourant(rs.getDouble("soldeCompteCourant"));
				cust.setSoldeCompteEpargne(rs.getDouble("soldeCompteEpargne"));

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new MyBusinessException("Echec lecture de l'utilisateur d'id: " + id, e);
		} finally {
			close(cn, st, rs);
		}

		return cust;

	}

	// Create OK
	@Override
	public int create(Client c) throws MyBusinessException {
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "insert into client (prenom, nom, email, adresse, soldeCompteCourant, soldeCompteEpargne ) values (?, ?, ?, ?, ?, ?)";

			st = cn.prepareStatement(sql);

			st.setString(1, c.getPrenom());
			st.setString(2, c.getNom());
			st.setString(3, c.getEmail());
			st.setString(4, c.getAdresse());
			st.setDouble(5, c.getSoldeCompteCourant());
			st.setDouble(6, c.getSoldeCompteEpargne());

			result = st.executeUpdate();

			cn.commit();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new MyBusinessException("Echec creation de l'utilisateur : " + c, e);
		} finally {
			close(cn, st, null);
		}
		return result;
	}

	// Update OK

	@Override
	public int update(Client c) throws MyBusinessException {
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "update client set prenom = ?, nom = ?, email = ?, adresse = ? where idClient = ?";

			st = cn.prepareStatement(sql);
			st.setString(1, c.getPrenom());
			st.setString(2, c.getNom());
			st.setString(3, c.getEmail());
			st.setString(4, c.getAdresse());
			st.setInt(5, c.getIdClient());

			result = st.executeUpdate();
			cn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
			throw new MyBusinessException("Echec de l'update de l'utilisateur : " + c, e);
		} finally {
			close(cn, st, null);
		}
		return result;

	}

	// delete OK
	@Override
	public int delete(Client c) throws MyBusinessException {
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "delete from client where idClient = ?";

			st = cn.prepareStatement(sql);
			st.setInt(1, c.getIdClient());

			result = st.executeUpdate();
			cn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
			throw new MyBusinessException("Echec de la suppression de l'utilisateur : " + c, e);
		} finally {
			close(cn, st, null);
		}
		return result;

	}

	@Override
	public List<Client> getAll() throws MyBusinessException {
		Connection cn = null;
		PreparedStatement st = null;
		List<Client> maListe = new ArrayList<>();
		Client cli = null;

		ResultSet rs = null;

		try {
			cn = getConnectionDM();

			String sql = "select * from client";

			st = cn.prepareStatement(sql);

			rs = st.executeQuery();

			while (rs.next()) {
				cli = new Client();
				cli.setIdClient(rs.getInt("idClient"));
				cli.setPrenom(rs.getString("prenom"));
				cli.setNom(rs.getString("nom"));
				cli.setEmail(rs.getString("email"));
				cli.setAdresse(rs.getString("adresse"));
				cli.setSoldeCompteCourant(rs.getDouble("soldeCompteCourant"));
				cli.setSoldeCompteEpargne(rs.getDouble("soldeCompteEpargne"));

				maListe.add(cli);

			}
			for (Client client : maListe) {

				System.out.println(client);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new MyBusinessException("Echec lecture" + e);

		} finally {
			close(cn, st, rs);
		}

		return maListe;
	}



	@Override
	public int faireVirementAjout(Client c, double montant) throws MyBusinessException {
		
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;

		try {
			
			cn = getConnectionDM();
			String sql = "update client set soldeCompteCourant = ? where idClient = ?";

			
			st = cn.prepareStatement(sql);
			st.setDouble(1, c.getSoldeCompteCourant() + montant);
			st.setInt(2, c.getIdClient());
			

			result = st.executeUpdate();
			cn.commit();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
			throw new MyBusinessException(
					"Echec de l'update de l'utilisateur : ");
		} finally {
			close(cn, st, null);
		}
		return result;
		
	}

	@Override
	public int faireVirementRetrait(Client c, double montant) throws MyBusinessException {
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;

		try {
			
			cn = getConnectionDM();
			String sql = "update client set soldeCompteCourant = ? where idClient = ?";

			
			st = cn.prepareStatement(sql);
			st.setDouble(1, c.getSoldeCompteCourant() - montant);
			st.setInt(2, c.getIdClient());
			

			result = st.executeUpdate();
			cn.commit();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
			throw new MyBusinessException(
					"Echec de l'update de l'utilisateur : ");
		} finally {
			close(cn, st, null);
		}
		return result;
	}

}

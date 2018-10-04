package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exception.MyBusinessException;
import model.Client;

public class CustomerDaoImpl extends AbstractDaoJdbc implements CustomerDao {

	@Override
	public Client findById(int id) throws MyBusinessException{
		Client cust = null;
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			cn = getConnectionDM();

			String sql = "select firstname, lastname, age, id from Client where id = ?";

			st = cn.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();

			if (rs.next()) {
				cust = new Client();

				cust.setFirstname(rs.getString("firstname"));
				cust.setLastname(rs.getString("lastname"));
				cust.setAge(rs.getInt("age"));
				cust.setId(rs.getInt("id"));

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new MyBusinessException("Echec lecture de l'utilisateur d'id: " + id, e);
		} finally {
			close(cn, st, rs);
		}

		return cust;

	}

	@Override
	public int create(Client c) throws MyBusinessException{
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "insert into Client (firstname, lastname, age) values (?, ?, ?)";

			st = cn.prepareStatement(sql);

			st.setString(1, c.getFirstname());
			st.setString(2, c.getLastname());
			st.setInt(3, c.getAge());

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

	@Override
	public int update(Client c) throws MyBusinessException{
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "update Client set firstname = ?, lastname = ?, age = ? where id = ?";

			st = cn.prepareStatement(sql);
			st.setString(1, c.getFirstname());
			st.setString(2, c.getLastname());
			st.setInt(3, c.getAge());
			st.setInt(4, c.getId());

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

	@Override
	public int delete(Client c) throws MyBusinessException{
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "delete from Client where id = ?";

			st = cn.prepareStatement(sql);
			st.setInt(1, c.getId());

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

}

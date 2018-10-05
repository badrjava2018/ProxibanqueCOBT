package persistence;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class AbstractDaoJdbc {

	protected void close(Connection cn, PreparedStatement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
		}
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
		}
		try {
			if (cn != null)
				cn.close();
		} catch (SQLException e) {
		}
	}

	
	// TO DO : Mettre le bon url : OK
	
	
	public Connection getConnectionDM() throws ClassNotFoundException, SQLException {
		Connection cn;
		// etablir la connexion
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost/proxibanquecobt";
		String username = "root";
		String password = "";

		cn = DriverManager.getConnection(url, username, password);
		cn.setAutoCommit(false);
		return cn;
	}

}
package persistence;

import exception.MyBusinessException;
import model.Client;

public interface CustomerDao {
	Client findById(int id) throws MyBusinessException;

	int create(Client c) throws MyBusinessException;

	int update(Client c) throws MyBusinessException;

	int delete(Client c) throws MyBusinessException;

}

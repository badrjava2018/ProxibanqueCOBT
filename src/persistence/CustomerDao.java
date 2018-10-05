package persistence;

import java.util.List;

import exception.MyBusinessException;
import model.Client;


public interface CustomerDao {
	Client findById(int id) throws MyBusinessException;

	int create(Client c) throws MyBusinessException;

	int update(Client c) throws MyBusinessException;

	int delete(Client c) throws MyBusinessException;
	
	List<Client> getAll() throws MyBusinessException;
	
	int faireVirementAjout(Client c, double montant) throws MyBusinessException;
	
	int faireVirementRetrait(Client c, double montant) throws MyBusinessException;

}

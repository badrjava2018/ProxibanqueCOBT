package service;

import java.util.List;

import exception.MyBusinessException;
import model.Client;
import persistence.CustomerDao;
import persistence.CustomerDaoImpl;

public class ServiceImplementation implements ClientService {

	CustomerDao dao = new CustomerDaoImpl();

	@Override
	public Client findClientById(int id) throws MyBusinessException {

		return dao.findById(id);
	}

	@Override
	public void addClient(Client c) throws MyBusinessException {
		if (c == null) {
			throw new MyBusinessException("Customer ne doit pas etre null!");

		} else {
			dao.create(c);
		}
	}

	@Override
	public void updateClient(Client c) throws MyBusinessException {
		if (c == null) {
			throw new MyBusinessException("Customer ne doit pas etre null!");

		} else {
			dao.update(c);
		}

	}

	@Override
	public void deleteClient(Client c) throws MyBusinessException {
		if (c == null) {
			throw new MyBusinessException("Customer ne doit pas etre null!");

		} else {
			dao.delete(c);
		}

	}

	@Override
	public List<Client> getAllClient() throws MyBusinessException {

		return dao.getAll();
	}

}

package service;

import java.util.List;

import exception.MyBusinessException;
import model.Client;

public interface ClientService {

	Client findClientById(int id) throws MyBusinessException;

	void addClient(Client c) throws MyBusinessException;

	void updateClient(Client c) throws MyBusinessException;

	void deleteClient(Client c) throws MyBusinessException;

	List<Client> getAllClient() throws MyBusinessException;

//	void faireVirement(CompteBancaire cmptBancaire1, CompteBancaire cmptBancaire2, double montant);

}

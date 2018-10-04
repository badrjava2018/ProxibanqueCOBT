package service;

import java.util.List;

import model.Client;
import model.CompteBancaire;

public interface ClientService {

	void addClient(Client c);

	Client findClientById(Integer id);

	List<Client> getAllClient();

	void updateClient(Client c);

	void deleteClientbyId(Integer id);

	void faireVirement(CompteBancaire cmptBancaire1, CompteBancaire cmptBancaire2, double montant);

}

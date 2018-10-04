package maintest;

import exception.MyBusinessException;
import model.Client;
import persistence.CustomerDao;
import persistence.CustomerDaoImpl;
import service.ClientService;
import service.ServiceImplementation;

public class MainTest {

	public static void main(String[] args) throws MyBusinessException {
		// TODO Auto-generated method stub

		CustomerDao dao = new CustomerDaoImpl();
		ClientService impl = new ServiceImplementation();
		
		//Findby ID : OK
		
//		System.out.println(dao.findById(2));
		
		//Create OK
		
//		Client c1 = new Client("badr", "taghzalt","badr@gmail.com","rue de paris",1542.25,5485.35);
//		dao.create(c1);
//		
		//Update ok
		
//		Client c3 = dao.findById(3);
//		
//		c3.setAdresse(" rue test");
//		dao.update(c3);
//		
//		Client c4 = dao.findById(7);
//		dao.delete(c4);
//		
		
		
//		System.out.println(dao.getAll());
		
//		Client c5 = dao.findById(1);
//		Client c6 = dao.findById(6);
//		
//		dao.faireVirement(c5, c6, 2500.0);
		
//		dao.faireVirement(dao.findById(3), dao.findById(6), 2500);
		
		
		Client c7 = new Client("Erica", "Baggi","ebaggi@gmail.com","25 rue alforville",15512.10,4455.35);
		impl.addClient(c7);
		
		
		
	}

}

package presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.MyBusinessException;
import model.Client;
import service.ClientService;
import service.ServiceImplementation;

/**
 * Servlet implementation class ServletEdition
 */
@WebServlet("/ServletEdition")
public class ServletEdition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int idclient;
	Client cli1;

	ClientService impl = new ServiceImplementation();
	
  
    public ServletEdition() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {

			String id = request.getParameter("id");
			idclient = Integer.parseInt(id);
			Client cli = impl.findClientById(idclient);
			request.setAttribute("detailClient", cli);
			
			
			cli1 = new Client(idclient);
			impl.updateClient(cli1);
			request.setAttribute("editClient", cli1);
			

		} catch (MyBusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		request.getRequestDispatcher("editionclient.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {

			String email = request.getParameter("email");
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String adresse = request.getParameter("adresse");
			
			String id = request.getParameter("id");
			idclient = Integer.parseInt(id);
//			idclient = Integer.parseInt(id);
			
			
			Client cli = impl.findClientById(idclient);
			cli.setNom(nom);
			cli.setPrenom(prenom);
			cli.setAdresse(adresse);
			cli.setEmail(email);
			impl.updateClient(cli);
			request.setAttribute("detailClient", cli);
			
			
			
//			cli1 = new Client(idclient);
//			impl.updateClient(cli1.setEmail(email));
//			impl.updateClient(cli1);
			
			request.setAttribute("editClient", cli1);
			

		} catch (MyBusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		request.getRequestDispatcher("accueil.jsp").forward(request, response);
		
		
		
	}

}

package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exception.MyBusinessException;
import model.Client;
import model.Conseiller;
import service.ClientService;
import service.ServiceImplementation;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClientService impl = new ServiceImplementation();
	
	public ServletConnexion() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String pwd = request.getParameter("password");

		Conseiller cons = new Conseiller(login, pwd);

		HttpSession maSession = request.getSession();
		maSession.setAttribute("conseillerlog", cons);
		
		
		
		
		try {
			List<Client> maListe = impl.getAllClient();
			maSession.setAttribute("CleClient", maListe);
		} catch (MyBusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		response.sendRedirect("accueil.jsp");
		
		// TODO : remettre l'acces avec mot de passe ci dessous
		

		if (("admin".equalsIgnoreCase(login)) && ("2018".equalsIgnoreCase(pwd))) {

			response.sendRedirect("accueil.jsp");

		} else {

			response.sendRedirect("loginErreur.jsp");
		}

		doGet(request, response);
	}

}

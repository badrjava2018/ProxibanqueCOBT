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
 * Servlet implementation class ServletFiche
 */
@WebServlet("/ServletFicheClient")
public class ServletFicheClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int idclient;

	ClientService impl = new ServiceImplementation();

	public ServletFicheClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		int idCli = Integer.valueOf(id);

//		Integer idclient = Integer.valueOf(id);

//		idclient = Integer.parseInt(id);

//	Client cli;
		try {

			String id = request.getParameter("id");
			idclient = Integer.parseInt(id);
			Client cli = impl.findClientById(idclient);
			request.setAttribute("detailClient", cli);

		} catch (MyBusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Client cli = impl.findClientById(id);

		request.getRequestDispatcher("ficheclient.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

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
 * Servlet implementation class ServletAccesDB
 */
@WebServlet("/ServletAccesDB")
public class ServletAccesDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ClientService impl = new ServiceImplementation();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAccesDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		int id = request.getParameter(id);
		
		try {
			int id = 0;
			Client cli = impl.findClientById(id);
			
			request.setAttribute("CleClient", cli);
			
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
			
		} catch (MyBusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

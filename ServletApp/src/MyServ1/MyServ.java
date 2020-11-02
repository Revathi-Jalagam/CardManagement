package MyServ1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.cardinfo.web.entities.CreditCardInfo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServ
 */
@WebServlet("/CCInfo")
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write("<h1>IBS HomePage</h1>");
		ArrayList<CreditCardInfo> ccInfo = new ArrayList<CreditCardInfo>();
		ccInfo.add(new CreditCardInfo("12345","01/01/2021","50000","Active"));
		request.setAttribute("ccdata", ccInfo);
		//Creating a RequestDispatcher object to dispatch 
		// the request the request to another resource 
		  RequestDispatcher rd =  
		      request.getRequestDispatcher("CreditCard.jsp"); 

		// The request will be forwarded to the resource  
		// specified, here the resource is a JSP named, 
		// "stdlist.jsp" 
		   rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

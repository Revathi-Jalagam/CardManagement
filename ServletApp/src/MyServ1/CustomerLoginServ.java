package MyServ1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerLoginServ
 */
@WebServlet("/CustomerLogin")
public class CustomerLoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerLoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//access request data
		
		String logid = request.getParameter("logid");
		String password = request.getParameter("Password");
		
				
		PrintWriter writer =response.getWriter();		
		if (logid.contentEquals("Revathi123") && password.contentEquals("abc")) {
			
			response.sendRedirect("accounthomepage.jsp");
			/*writer.write("<h1> Welcome to Customer Homepage </h1>");*/
		}else {
			
			response.sendRedirect("invalidlogin.jsp");
			/*writer.write("<h1> Invalid Login Credentials!!! </h1>");
			writer.write("<h2> Please enter valid credetials!!! </h2>");*/
		}		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

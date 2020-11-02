package MyServ1;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardinfo.web.entities.DebitCardInfo;

/**
 * Servlet implementation class ViewDebitServ
 */
@WebServlet("/ViewDebitServ")
public class DebitCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DebitCardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) 
throws ServletException, IOException 
{ 
response.setContentType("text/html;charset=UTF-8"); 
ArrayList<DebitCardInfo> dcInfo = new ArrayList<DebitCardInfo>();
dcInfo.add(new DebitCardInfo("12345","01/01/2021","50000","Active"));
request.setAttribute("data", dcInfo);
//Creating a RequestDispatcher object to dispatch 
// the request the request to another resource 
  RequestDispatcher rd =  
      request.getRequestDispatcher("DebitCard.jsp"); 

// The request will be forwarded to the resource  
// specified, here the resource is a JSP named, 
// "stdlist.jsp" 
   rd.forward(request, response);
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
				try {
					switch(action) {
					case "add" : break;
					case "delete" : break;
					default: break;
					}}catch(Exception ex) {
						
					}
				response.setContentType("text/html;charset=UTF-8"); 
				ArrayList<DebitCardInfo> dcInfo = new ArrayList<DebitCardInfo>();
				dcInfo.add(new DebitCardInfo("12345","01/01/2021","50000","Active"));
				request.setAttribute("dcdata", dcInfo);
				//Creating a RequestDispatcher object to dispatch 
				// the request the request to another resource 
				  RequestDispatcher rd =  
				      request.getRequestDispatcher("DebitCard.jsp"); 

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

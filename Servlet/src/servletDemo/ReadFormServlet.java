package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadFormServlet
 */
public class ReadFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ReadFormServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out = response.getWriter();
	  String fname = request.getParameter("fname");
	  String lname = request.getParameter("lname");
	  String email = request.getParameter("email");
	  String mobile = request.getParameter("mobile");
	  
	  out.println(fname);
	  out.println(lname);
	  out.println(email);
	  out.println(mobile);
	}  // service()

}  // ReadFormServlet
package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out = response.getWriter();
	  String uname = request.getParameter("uname");
	  String pass = request.getParameter("pass");
	  if (uname.equalsIgnoreCase(pass)) {
	    //request.getRequestDispatcher("success.html").forward(request, response);
	    response.sendRedirect("success.html");
	  } else {
	    //request.getRequestDispatcher("login.html").forward(request, response);
	    response.sendRedirect("login.html");
	  }
	}

}

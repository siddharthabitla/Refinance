package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  PrintWriter out = response.getWriter();
	   //out.println("+-----+ line from Servlet2 +-----+");
	  /*String name = (String) request.getAttribute("name");
	  out.println(name);*/
	  Cookie[] c = request.getCookies();
	  for (int i = 0; i < c.length; i++) {
		  out.println(c[i].getName() + " " + c[i].getValue());
	  }
	  //String address = request.getParameter("address");
	  String fname = request.getParameter("fname");
	  String lname = request.getParameter("lname");
	  //out.println(address);
	  out.println(fname);
	  out.println(lname);
	}

}

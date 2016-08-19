package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out = response.getWriter();
	  /*ServletContext context = getServletContext();
	  request.setAttribute("name", "Sidd");
	  RequestDispatcher rd = context.getRequestDispatcher("/Servlet2");
	  //out.println("+-----+ first line from Servlet1 +-----+");
	  //rd.include(request, response);
	  //rd.forward(request, response);
	  response.sendRedirect("Servlet2");
	   out.println("+-----+ last line from Servlet1 +-----+");*/
	  String address = request.getParameter("address");
	  Cookie c1 = new Cookie("address", address);
	  response.addCookie(c1);
	  
	  out.println("<html>");
	  out.println("<head></head>");
	  out.println("<body>");
	  out.println("<form action=\"Servlet2\">");
	  out.println("FNAME<input type=\"text\" name=\"fname\"/>");
	  out.println("<br/>");
	  out.println("LNAME<input type=\"text\" name=\"lname\"/>");
	  out.println("<br/>");
	  out.println("<input type=\"submit\" value=\"submit\">");
	  out.println("</form>");
	  out.println("</body>");
	  out.println("</html>");
	}

}
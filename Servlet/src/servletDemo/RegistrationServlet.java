package servletDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  int eid = Integer.parseInt(request.getParameter("id"));
	  String ename = request.getParameter("ename");
	  int salary = Integer.parseInt(request.getParameter("salary"));
	  
	  try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "vasistha");
	    PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
	    pstmt.setInt(1, eid);
	    pstmt.setString(2, ename);
	    pstmt.setInt(3, salary);
	    pstmt.executeUpdate();
	  } catch (Exception e) {
	    e.printStackTrace();
	  }
	}

}

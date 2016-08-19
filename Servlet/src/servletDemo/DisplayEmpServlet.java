package servletDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayEmpServlet
 */
public class DisplayEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "vasistha");
      Statement stmt = con.createStatement();
      String query = "select * from emp";
      ResultSet rs = stmt.executeQuery(query);
      
      ArrayList<Employee> elist = new ArrayList<Employee>();
      while (rs.next()) {
    	  Employee e = new Employee();
    	  e.setId(rs.getInt("id"));
    	  e.setEname(rs.getString("ename"));
    	  e.setSalary(rs.getInt("salary"));
    	  elist.add(e);
      }
      request.setAttribute("elist", elist);
      request.getRequestDispatcher("displayEmps2.jsp").forward(request, response);
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	}

}
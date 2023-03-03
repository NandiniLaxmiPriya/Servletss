package jam;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Fruite
 */
public class Fruite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = Integer.parseInt(req.getParameter("num3"));
		int l = Integer.parseInt(req.getParameter("num4"));
		int m = Integer.parseInt(req.getParameter("num5"));
		int n = Integer.parseInt(req.getParameter("num6"));
		int total = i + j + k + l + m + n;
		float avg = total / 6;
		
		PrintWriter out = res.getWriter();
		out.println("Maths : " + i );	
		out.println("English : " + j );	
		out.println("Hindi : " + k);	
		out.println("Science : " + l);	
		out.println("Social Science : " + m);	
		out.println("IT : " + n);	
		out.println("Total Marks : "+ total);	
		out.println("Average: "+avg);
	}
}

package prac;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class One
 */
@WebServlet("/One")
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config = null;
	public void init()
	{
		this.config = config;
	}
	public void service(ServletRequest req, ServletResponse resp) throws IOException
	{
		PrintWriter out  = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello</h1>");
		out.print("</body>");
		out.print("</html>");
		
		
	}
}

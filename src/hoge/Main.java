package hoge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=Windows-31J");
			PrintWriter out = response.getWriter();
	       	out.println("<!DOCTYPE html>");
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<meta charset='utf-8' />");
	        out.println("<title>Ten Numbers</title>");
	        out.println("</head>");
	        out.println("<body>");
	        for(int i=0; i<=9; i++){
				out.println("<TR>");
				for(int j=0; j<=9; j++){
					out.println("<TD>"+ i*j + "</TD>");
				}
				out.println("</TR>");
			}
			out.println("</TABLE>");
	        out.println("</body>");
	        out.println("</html>");
	}
}

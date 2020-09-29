

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgendaServlet
 */
@WebServlet("/AgendaServlet")
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println(">>>>>>>>>>>>>> REQUEST " + request.getMethod());
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
	
		request.setAttribute("login", login);
		
		if(login.equals("cbgomes@gmail.com") && senha.equals("1234")) {
			
			PrintWriter out = response.getWriter();
			out.println("<html>\n" + "<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title> Acesso </title>");
			out.println("<body>\n" + 
					"	<div align=\"center\">\n" + 
					"		<p>Seja bem vindo, Sr. " + login +
					"</p>\n" + 
					"		\n" + 
					"	</div>\n" + 
					"</body>");
			out.println("</html>");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		
	}
}

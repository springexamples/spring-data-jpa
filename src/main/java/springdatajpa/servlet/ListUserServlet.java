package springdatajpa.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springdatajpa.domain.User;

/**
 * Servlet implementation class ListUserServlet
 */
public class ListUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public ListUserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Iterable<User> usersIter = userService.findAllUsers();

		response.getOutputStream().println("<table>");
		response.getOutputStream()
				.println(
						"<tr><th> First Name </th><th> Last Name </th><th> Age </th></tr>");

		for (User user : usersIter) {
			response.getOutputStream().println(
					"<tr><td>" + user.getFirstName() + "</td><td>"
							+ user.getLastName() + "</td><td>" + user.getAge()
							+ "</td></tr>");
		}

		response.getOutputStream().println("</table>");
		response.getOutputStream().flush();
	}

}

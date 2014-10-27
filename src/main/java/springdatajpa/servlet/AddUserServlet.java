package springdatajpa.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String _age = request.getParameter("age");
		int age = _age != null && _age.matches("[0-9]+") ? Integer
				.parseInt(_age) : 0;

		userService.addUser(firstName, lastName, age);

		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

package springdatajpa.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import springdatajpa.service.UserService;

public class BaseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected UserService userService;
	protected WebApplicationContext context;

	@Override
	public void init() throws ServletException {
		super.init();
		context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());

		userService = context.getBean("userService", UserService.class);
	}

}

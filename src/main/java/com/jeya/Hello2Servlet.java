package com.jeya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class Hello2Servlet
 */
public class Hello2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger logger = 
    		LoggerFactory.getLogger(Hello2Servlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello2Servlet() {
        super();
        BasicConfigurator.configure();
		logger.info("Super!!");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("A request has been received!!");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello from Servlet</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}

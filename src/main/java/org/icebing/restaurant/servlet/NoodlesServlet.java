package org.icebing.restaurant.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class NoodlesServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3243844558068412L;
	private static Logger logger = Logger.getLogger(NoodlesServlet.class); 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pWriter = resp.getWriter();
		String vegetable = req.getParameter("vegetable");
		if(vegetable == null){
			vegetable = "Tomato";
			logger.debug("Vegetable virtual =" + vegetable);
		} else {
			logger.debug("Vegetable real =" + vegetable);
		}
		pWriter.println("<html><body>");
		pWriter.println("<ht>Noodles with=" + vegetable + "</h1>");
		pWriter.println("</body></html>");
	}
}

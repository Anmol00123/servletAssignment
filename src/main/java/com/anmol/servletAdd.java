package com.anmol;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servletAdd extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String a = (req.getParameter("fname"));
		String b = (req.getParameter("lname"));	
		String c = (req.getParameter("email"));
		String d = (req.getParameter("phonenumber"));
		
		req.setAttribute("fname", a);
		req.setAttribute("lname", b);
		req.setAttribute("email", c);
		req.setAttribute("phonenumber", d);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("nc");
		rd.forward(req, res);
		
		RequestDispatcher rdi = req.getRequestDispatcher("lc");
		rdi.forward(req, res);

	}


}

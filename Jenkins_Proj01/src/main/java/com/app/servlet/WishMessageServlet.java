package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/wish")
public class WishMessageServlet extends HttpServlet{



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set response content type
		resp.setContentType("text/html");
		//get printWriter
		PrintWriter pw=resp.getWriter();
		//write the messages to response object
		pw.println("<h1 style='color:red;text-align:center'>Good Morning</h1>");
		//home hyperlink
		pw.println("<br><br><a href='index.jsp'>home</a>");
		//close stream
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);

	}
	
	
	
}

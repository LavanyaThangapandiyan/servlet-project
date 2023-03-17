package com.anigna.web;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class GreetUser extends HttpServlet
{
public void service(ServletRequest req, ServletResponse res)throws IOException
{
	res.setContentType("text/html");
	res.getWriter().print("<h1> My First Web Project!</h1>");
}
	public GreetUser() {
		// TODO Auto-generated constructor stub
	}

}

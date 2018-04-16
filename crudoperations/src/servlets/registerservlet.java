package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.registerdao;
import userbean.userbean;
@WebServlet("/registerservlet")
public class registerservlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
    userbean user=new userbean();
    user.setUsername(request.getParameter("username"));
    user.setPassword(request.getParameter("password"));
    user.setEmail(request.getParameter("email"));
    user.setId(Integer.parseInt(request.getParameter("id")));
	registerdao.register(user);	
	response.sendRedirect("registersuccess.jsp");	
		
		
	}
	
	

}

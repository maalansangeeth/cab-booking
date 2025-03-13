package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.adddriver;
import service.web_service;


@WebServlet("/deldri")
public class deldri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deldri() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		adddriver del=new adddriver();
		
		
		del.setDriver_id(request.getParameter("driver_id"));
		web_service del_ser=new web_service();
		del_ser.del_driver(del);
		RequestDispatcher dis=request.getRequestDispatcher("driverstb");
		dis.forward(request, response);
		
		
		
	}

}

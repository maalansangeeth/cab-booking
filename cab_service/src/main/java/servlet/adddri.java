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


@WebServlet("/adddri")
public class adddri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public adddri() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		adddriver app5=new adddriver();
		
		app5.setDriver_id(request.getParameter("driver_id"));
		app5.setName(request.getParameter("name"));
		app5.setLicense_no(request.getParameter("license_no"));
		app5.setAddress(request.getParameter("address"));
		app5.setContact_no(Integer.parseInt(request.getParameter("contact_no")));
		
		
		web_service app6=new web_service();
		app6.adddriver(app5);
		
	
		RequestDispatcher diss=request.getRequestDispatcher("adminDashboard.jsp");
		
		diss.forward(request, response);
		}
	}



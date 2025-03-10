package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.addvehicle;
import service.web_service;


@WebServlet("/addve")
public class addve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addve() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
    addvehicle app3=new addvehicle(); 
    
    app3.setVehicle(request.getParameter("vehicle"));
    app3.setBrand_model(request.getParameter("brand_model"));
	app3.setNumber_plate(request.getParameter("number_plate"));
	app3.setChassis_no(request.getParameter("chassis_no"));
	
	
	
	
	web_service app4=new web_service();
	app4.add_vehicle(app3);
		
	RequestDispatcher diss=request.getRequestDispatcher("adminDashboard.jsp");
	
	diss.forward(request, response);
	}

}

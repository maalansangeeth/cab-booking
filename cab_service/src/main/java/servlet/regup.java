package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.web_service;


@WebServlet("/regup")
public class regup extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public regup() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String reg_noo=request.getParameter("reg_no");
		String namee=request.getParameter("name");
		String addresss=request.getParameter("address");
		String NICC=request.getParameter("NIC");
		int contact_noo=Integer.parseInt(request.getParameter("contact_no"));
		String usernamee=request.getParameter("username");
		String passwordd=request.getParameter("password");
	
	
		  web_service userModel = new  web_service();
	        boolean isUpdated = userModel.updateregister(reg_noo, namee, addresss, NICC, contact_noo, usernamee, passwordd);

	        if (isUpdated) {
	            request.setAttribute("message", "User updated successfully!");
	        } else {
	            request.setAttribute("message", "Error updating user!");
	        }

	        request.getRequestDispatcher("upreg.jsp").forward(request, response);
	    }
	
	
	
	}



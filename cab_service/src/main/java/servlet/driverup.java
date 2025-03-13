package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.web_service;


@WebServlet("/driverup")
public class driverup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public driverup() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		String driver_idd=request.getParameter("driver_id");
		String Namee=request.getParameter("name");
		String license_noo=request.getParameter("license_no");
		String addresss=request.getParameter("address");
		int contact_noo=Integer.parseInt(request.getParameter("contact_no"));
		
		  web_service userModel = new  web_service();
	        boolean isUpdated = userModel.updatedriver(driver_idd, Namee, license_noo, addresss, contact_noo);

	        if (isUpdated) {
	            request.setAttribute("message", "User updated successfully!");
	        } else {
	            request.setAttribute("message", "Error updating user!");
	        }

	        request.getRequestDispatcher("updriver.jsp").forward(request, response);
	    

		
	}

}

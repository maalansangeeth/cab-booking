package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.web_service;


@WebServlet("/vup")
public class vup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public vup() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String vehiclee=request.getParameter("vehicle");
		String brand_modell=request.getParameter("brand_model");
		String number_platee=request.getParameter("number_plate");
		String chassis_noo=request.getParameter("chassis_no");
		
		
		web_service userModel = new  web_service();
        boolean isUpdated = userModel.updatevehicle(vehiclee, brand_modell, number_platee,chassis_noo);

        if (isUpdated) {
            request.setAttribute("message", "User updated successfully!");
        } else {
            request.setAttribute("message", "Error updating user!");
        }

        request.getRequestDispatcher("upv.jsp").forward(request, response);
		
		
		
		
	}

}

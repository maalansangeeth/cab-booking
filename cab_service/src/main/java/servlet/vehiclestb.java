package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.addvehicle;
import service.web_service;

@WebServlet("/vehiclestb")
public class vehiclestb extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public vehiclestb() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        loadVehicleData(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        loadVehicleData(request, response);
    }

    private void loadVehicleData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        web_service service1 = new web_service();
        ArrayList<addvehicle> custom = service1.getallvehicle();

        System.out.println("Fetched vehicles count: " + custom.size()); // Debugging line

        request.setAttribute("cust", custom);
        RequestDispatcher dispatcher = request.getRequestDispatcher("vehicletb.jsp");
        dispatcher.forward(request, response);
    }
}

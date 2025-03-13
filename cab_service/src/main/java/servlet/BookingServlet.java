package servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Booking;
import service.web_service;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private web_service webService = new web_service();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Retrieve form data
            String customerName = request.getParameter("customerName");
            String pickupDateStr = request.getParameter("pickupDate");
            String vcStr = request.getParameter("vc"); // Vehicle chosen (String)
            int contactNumber = Integer.parseInt(request.getParameter("contactNumber"));
            int kmRun = Integer.parseInt(request.getParameter("kmRun"));
            double pricePerKm = Double.parseDouble(request.getParameter("pricePerKm"));

            // Validate data
            if (customerName == null || customerName.trim().isEmpty() ||
                pickupDateStr == null || pickupDateStr.trim().isEmpty() ||
                vcStr == null || vcStr.trim().isEmpty() ||  // Validate vc (vehicle chosen)
                kmRun <= 0 || pricePerKm <= 0) {
                
                request.setAttribute("errorMessage", "Invalid input. Please check your details.");
                request.getRequestDispatcher("booking.jsp").forward(request, response);
                return;
            }

            // Convert the pickup date string to LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate pickupDate = LocalDate.parse(pickupDateStr, formatter);

            // Calculate total cost
            double totalCost = kmRun * pricePerKm;

            // Create booking object with vc as String (no need to parse it as a date)
            Booking booking = new Booking(0, customerName, pickupDate, vcStr, contactNumber, kmRun, pricePerKm, totalCost);

            // Add booking to database
            webService.addBooking(booking);

           //********************************************************* 
            
            
         // Modify BookingServlet to forward the ID
            int bookingId = webService.addBooking(booking);  // Add the booking and get the ID
            request.setAttribute("bookingId", bookingId);    // Forward the booking ID
            request.getRequestDispatcher("Billing.jsp").forward(request, response);  // Forward to the same page

            
            //*******************************************************
            
            // Redirect to confirmation page
            response.sendRedirect("customerDashboard.jsp");

        } catch (NumberFormatException e) {
            request.setAttribute("errorMessage", "Invalid number format. Please enter valid numbers.");
            request.getRequestDispatcher("booking.jsp").forward(request, response);
        } catch (Exception e) {
            // Catch any other exception and print to console for debugging
            e.printStackTrace();  // Log the actual exception details
            request.setAttribute("errorMessage", "An error occurred. Please try again.");
            request.getRequestDispatcher("booking.jsp").forward(request, response);
        }
    }
}

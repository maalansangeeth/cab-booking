package servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import service.web_service;
import model.Booking;

@WebServlet("/GenerateBillServlet")
public class GenerateBillServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private web_service webService = new web_service();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int bookingId = Integer.parseInt(request.getParameter("bookingId"));

            // Retrieve the booking details from the database
            Booking booking = webService.getBookingById(bookingId);

            if (booking == null) {
                request.setAttribute("errorMessage", "No booking found for the provided ID.");
                request.getRequestDispatcher("billing.jsp").forward(request, response);
                return;
            }

            // Set content type to PDF
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=BookingBill_" + bookingId + ".pdf");

            // Create PDF document
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();

            // Add company logo (ensure the logo is available in the correct directory)
            try {
                Image logo = Image.getInstance(getServletContext().getRealPath("/images/logo.png")); // Path to the logo image
                logo.scaleToFit(100, 100);
                logo.setAlignment(Image.ALIGN_LEFT);
                document.add(logo);
            } catch (Exception e) {
                e.printStackTrace(); // Handle exception if logo is missing
            }

            // Add company details
            Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
            Font regularFont = new Font(Font.FontFamily.TIMES_ROMAN, 12);
            
            document.add(new Paragraph("Mega City Cab Service", boldFont));
            document.add(new Paragraph("Company Address: 123 Main Street, City, Country"));
            document.add(new Paragraph("Phone: (123) 456-7890 | Email: info@megacitycab.com"));
            document.add(new Paragraph("---------------------------------------------------------"));
            document.add(new Paragraph("Invoice Date: " + java.time.LocalDate.now()));
            document.add(new Paragraph("Booking ID: " + booking.getBookingId()));
            document.add(new Paragraph("---------------------------------------------------------"));
            document.add(new Paragraph("Customer Details", boldFont));
            document.add(new Paragraph("Customer Name: " + booking.getCustomerName(), regularFont));
            document.add(new Paragraph("Contact Number: " + booking.getContactNumber(), regularFont));
            document.add(new Paragraph("Pickup Date: " + booking.getPickupDate(), regularFont));
            document.add(new Paragraph("---------------------------------------------------------"));
            document.add(new Paragraph("Booking Details", boldFont));
            document.add(new Paragraph("Vehicle: " + booking.getVc(), regularFont));
            document.add(new Paragraph("KM Run: " + booking.getKmRun(), regularFont));
            document.add(new Paragraph("Price per KM: " + booking.getPricePerKm(), regularFont));
            document.add(new Paragraph("Total Cost: " + booking.getTotalCost(), regularFont));
            document.add(new Paragraph("---------------------------------------------------------"));

            // Add footer with total cost and thank you note
            Font footerFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
            document.add(new Paragraph("Total Due: " + booking.getTotalCost(), footerFont));
            document.add(new Paragraph("---------------------------------------------------------"));
            document.add(new Paragraph("Thank you for choosing Mega City Cab Service!"));

            // Close the document
            document.close();

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred while generating the bill.");
            request.getRequestDispatcher("billing.jsp").forward(request, response);
        }
    }
}

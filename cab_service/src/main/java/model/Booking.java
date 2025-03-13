package model;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private String customerName;
    private LocalDate pickupDate;
    private String vc;
    private int contactNumber;
    private int kmRun;
    private double pricePerKm;
    private double totalCost;

    // Constructor
    public Booking() {}

    public Booking(int bookingId, String customerName, LocalDate pickupDate, String vc, int contactNumber, int kmRun, double pricePerKm, double totalCost) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.pickupDate = pickupDate;
        this.vc = vc;
        this.contactNumber = contactNumber;
        this.kmRun = kmRun;
        this.pricePerKm = pricePerKm;
        this.totalCost = totalCost;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getVc() {
		return vc;
	}

	public void setVc(String vc) {
		this.vc = vc;
	}
	
    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getKmRun() {
        return kmRun;
    }

    public void setKmRun(int kmRun) {
        this.kmRun = kmRun;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

	
}


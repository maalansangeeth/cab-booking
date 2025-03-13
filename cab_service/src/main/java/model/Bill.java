package model;

public class Bill {
    private String vehicleType, brand, model, numberPlate, chassisNumber;
    private String driverId, driverName, licenseNumber, driverAddress, driverContact;
    private String tripDate;
    private int kmsRun;
    private double pricePerKm, totalBill;
    private String customerName, customerNIC, customerAddress, customerContact;

    // Constructor
    public Bill(String vehicleType, String brand, String model, String numberPlate, String chassisNumber, 
                String driverId, String driverName, String licenseNumber, String driverAddress, String driverContact, 
                String tripDate, int kmsRun, double pricePerKm, 
                String customerName, String customerNIC, String customerAddress, String customerContact) {
        
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
        this.numberPlate = numberPlate;
        this.chassisNumber = chassisNumber;
        this.driverId = driverId;
        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
        this.driverAddress = driverAddress;
        this.driverContact = driverContact;
        this.tripDate = tripDate;
        this.kmsRun = kmsRun;
        this.pricePerKm = pricePerKm;
        this.totalBill = kmsRun * pricePerKm;
        this.customerName = customerName;
        this.customerNIC = customerNIC;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
    }

    // Getters and Setters for all fields
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getNumberPlate() { return numberPlate; }
    public void setNumberPlate(String numberPlate) { this.numberPlate = numberPlate; }

    public String getChassisNumber() { return chassisNumber; }
    public void setChassisNumber(String chassisNumber) { this.chassisNumber = chassisNumber; }

    public String getDriverId() { return driverId; }
    public void setDriverId(String driverId) { this.driverId = driverId; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public String getDriverAddress() { return driverAddress; }
    public void setDriverAddress(String driverAddress) { this.driverAddress = driverAddress; }

    public String getDriverContact() { return driverContact; }
    public void setDriverContact(String driverContact) { this.driverContact = driverContact; }

    public String getTripDate() { return tripDate; }
    public void setTripDate(String tripDate) { this.tripDate = tripDate; }

    public int getKmsRun() { return kmsRun; }
    public void setKmsRun(int kmsRun) { this.kmsRun = kmsRun; }

    public double getPricePerKm() { return pricePerKm; }
    public void setPricePerKm(double pricePerKm) { this.pricePerKm = pricePerKm; }

    public double getTotalBill() { return totalBill; }
    public void setTotalBill(double totalBill) { this.totalBill = totalBill; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getCustomerNIC() { return customerNIC; }
    public void setCustomerNIC(String customerNIC) { this.customerNIC = customerNIC; }

    public String getCustomerAddress() { return customerAddress; }
    public void setCustomerAddress(String customerAddress) { this.customerAddress = customerAddress; }

    public String getCustomerContact() { return customerContact; }
    public void setCustomerContact(String customerContact) { this.customerContact = customerContact; }
}
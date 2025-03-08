package service;


import control.database;
import model.Booking;
import model.adddriver;
import model.addvehicle;
import model.register;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class web_service {
	//****************************************************************************************************************************
	//add user
	public void reg_user(register app1)
	{
		try {
			String query="insert into new_table values ('"+app1.getReg_no()+"','"+app1.getName()+"','"+app1.getAddress()+"','"+app1.getNIC()+"','"+app1.getContact_no()+"','"+app1.getUsername()+"','"+app1.getPassword()+"')";
			Statement state=database.getcon().createStatement();
			state.executeUpdate(query);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
		
	//************************************************************************************************************************************
//add vehicle
	public void add_vehicle(addvehicle app3)
	{
		try {
			String query="insert into addvehicle values ('"+app3.getVehicle()+"','"+app3.getBrand_model()+"','"+app3.getNumber_plate()+"','"+app3.getChassis_no()+"')";
			Statement state=database.getcon().createStatement();
			state.executeUpdate(query);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//************************************************************************************************************************************
	//add driver
		public void adddriver(adddriver app5)
		{
			try {
				String query="insert into driver values ('"+app5.getDriver_id()+"','"+app5.getName()+"','"+app5.getLicense_no()+"','"+app5.getAddress()+"','"+app5.getContact_no()+"')";
				Statement state=database.getcon().createStatement();
				state.executeUpdate(query);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	//***************************************************************************************************************
	//update register
		public boolean updateregister(String reg_noo,String namee,String addresss,String NICC,int contact_noo,String usernamee,String passwordd) {
	        try (Connection con = database.getcon()) {
	            String query = "UPDATE new_table SET  name = ?, address=?, NIC=?, contact_no=?, username=?, password=? WHERE reg_no = ?";
	            PreparedStatement ps = con.prepareStatement(query);
	          
										            /*String reg_noo=request.getParameter("reg_no");
										    		String namee=request.getParameter("name");
										    		String addresss=request.getParameter("address");
										    		String NICC=request.getParameter("NIC");
										    		int contact_noo=Integer.parseInt(request.getParameter("contact_no"));
										    		String usernamee=request.getParameter("username");
										    		String passwordd=request.getParameter("password");*/
	            
	            
	            ps.setString(1, namee);
	            ps.setString(2, addresss);
	            ps.setString(3, NICC);
	            ps.setInt(4, contact_noo);
	            ps.setString(5, usernamee);
	            ps.setString(6, passwordd);
	            ps.setString(8, reg_noo);

	            int rowsUpdated = ps.executeUpdate();
	            return rowsUpdated > 0;
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
//************************************************************************************************************************
		public boolean updatevehicle(String vehiclee, String brand_modell, String number_platee, String chassis_noo) {
			
			 try (Connection con = database.getcon()) {
		            String query = "UPDATE addvehicle SET  brand_model = ?, number_plate=?, chassis_no=? WHERE vehicle = ?";
		            PreparedStatement ps = con.prepareStatement(query);

		            ps.setString(1, brand_modell);
		            ps.setString(2, number_platee);
		            ps.setString(3, chassis_noo);
		            ps.setString(4, vehiclee);	           
		          

		            int rowsUpdated = ps.executeUpdate();
		            return rowsUpdated > 0;
		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();
			
			return false;
		}
		
	}
//*************************************************************************************************************************
		public boolean updatedriver(String driver_idd, String namee, String license_noo, String addresss,int contact_noo) {
			
			 try (Connection con = database.getcon()) {
		            String query = "UPDATE driver SET  name = ?, license_no=?, address=?, contact_no=? WHERE driver_id = ?";
		            PreparedStatement ps = con.prepareStatement(query);

		            ps.setString(1, namee);
		            ps.setString(2, license_noo);
		            ps.setString(3, addresss);
		            ps.setInt(4, contact_noo);
		            ps.setString(5, driver_idd);	           
		          

		            int rowsUpdated = ps.executeUpdate();
		            return rowsUpdated > 0;
		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();	
			
			
			
			return false;
		}
		
		
		}	
		
	//****************************************************************************************************************
		//register table
		public ArrayList<register> getallregister()
		{
			try {
				ArrayList<register> listcus=new ArrayList<register>();
				String query="select*from new_table";
				Statement statement=database.getcon().createStatement();
				ResultSet rs=statement.executeQuery(query);
				while(rs.next())
				{
					register cus1=new register();
					
					
					cus1.setReg_no(rs.getString("reg_no"));
					cus1.setName(rs.getString("name"));
					cus1.setAddress(rs.getString("address"));
					cus1.setNIC(rs.getString("NIC"));
					cus1.setContact_no(rs.getInt("contact_no"));
					cus1.setUsername(rs.getString("username"));
					cus1.setPassword(rs.getString("password"));
					
					

					
					listcus.add(cus1);
				}
				return listcus;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	//*********************************************************************************************************
		// vehicle table
		
		public ArrayList<addvehicle> getallvehicle()
		{
			try {
				ArrayList<addvehicle> listcus=new ArrayList<addvehicle>();
				String query="select*from addvehicle";
				Statement statement=database.getcon().createStatement();
				ResultSet rs=statement.executeQuery(query);
				while(rs.next())
				{
					addvehicle cus1=new addvehicle();
					
					
					cus1.setVehicle(rs.getString("vehicle"));
					cus1.setBrand_model(rs.getString("brand_model"));
					cus1.setNumber_plate(rs.getString("number_plate"));
					cus1.setChassis_no(rs.getString("chassis_no"));
					
				

					
					listcus.add(cus1);
				}
				return listcus;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
	//*******************************************************************************************************************
		//driver table
		
		public ArrayList<adddriver> getalldriver()
		{
			try {
				ArrayList<adddriver> listcus=new ArrayList<adddriver>();
				String query="select*from driver";
				Statement statement=database.getcon().createStatement();
				ResultSet rs=statement.executeQuery(query);
				while(rs.next())
				{
					adddriver cus1=new adddriver();
					
					
					cus1.setDriver_id(rs.getString("driver_id"));
					cus1.setName(rs.getString("name"));
					cus1.setLicense_no(rs.getString("license_no"));
					cus1.setAddress(rs.getString("address"));
					cus1.setContact_no(rs.getInt("contact_no"));
					
				
					
					listcus.add(cus1);
				}
				return listcus;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		//***************************************************************************************************************
		//delete register
		
		public void del_register(register del)
		{
			try {
				String query="delete from new_table where reg_no='"+del.getReg_no()+"'";
				Statement statet=database.getcon().createStatement();
				statet.executeUpdate(query);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//****************************************************************************************************************
		//delete vehicle
		
		public void del_vehicle(addvehicle del)
		{
			try {
				String query="delete from addvehicle where vehicle='"+del.getVehicle()+"'";
				Statement statet=database.getcon().createStatement();
				statet.executeUpdate(query);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//****************************************************************************************************************
		//delete driver
		
		public void del_driver(adddriver del)
		{
			try {
				String query="delete from driver where driver_id='"+del.getDriver_id()+"'";
				Statement statet=database.getcon().createStatement();
				statet.executeUpdate(query);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//*********************************************************************************************************************
		public boolean validate(register user_log)
		{
			try {
				
				String query = "select * from new_table where username ='" + user_log.getUsername() + "' and password='" + user_log.getPassword() + "'";
		Statement statement=database.getcon().createStatement();
		ResultSet rs=statement.executeQuery(query);

				if(rs.next()) { //next kiyana eken enne boolean value ekak
					return true; //rs ekata data samanam true kiyala return karanawa
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return false;
		}
	 //*********************************************************************************************************************************************
	 //login

		public register getone(register user_log) {
		    register user = null;

		    try {
		        String query = "SELECT * FROM new_table WHERE username = ?";
		        Connection con = database.getcon();
		        PreparedStatement ps = con.prepareStatement(query);
		        ps.setString(1, user_log.getUsername());

		        ResultSet rs = ps.executeQuery();

		        if (rs.next()) {
		            user = new register();
		            user.setReg_no(rs.getString("reg_no"));
		            user.setName(rs.getString("name"));
		            user.setAddress(rs.getString("address"));
		            user.setNIC(rs.getString("NIC"));
		            user.setContact_no(rs.getInt("contact_no"));
		            user.setUsername(rs.getString("username"));
		            user.setPassword(rs.getString("password"));
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return user;
		}

	 //*********************************************************************************************************************************************

		
		public int addBooking(Booking booking) {
		    String query = "INSERT INTO booking (customerName, pickupDate, vc, contactNumber, kmRun, pricePerKm, totalCost) VALUES (?, ?, ?, ?, ?, ?, ?)";
		    int generatedId = -1;
		    try (Connection con = database.getcon(); PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

		        ps.setString(1, booking.getCustomerName());
		        ps.setDate(2, java.sql.Date.valueOf(booking.getPickupDate()));
		        ps.setString(3, booking.getVc());
		        ps.setInt(4, booking.getContactNumber());
		        ps.setInt(5, booking.getKmRun());
		        ps.setDouble(6, booking.getPricePerKm());
		        ps.setDouble(7, booking.getTotalCost());

		        ps.executeUpdate();

		        // Get the generated ID
		        ResultSet rs = ps.getGeneratedKeys();
		        if (rs.next()) {
		            generatedId = rs.getInt(1);  // Get the auto-generated booking ID
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return generatedId;  // Return the generated ID
		}

		//*********************************************************************************************************************************************

		
		
		// billing
		public Booking getBookingById(int bookingId) {
		    Booking booking = null;
		    String query = "SELECT * FROM booking WHERE bookingId = ?";
		    try (Connection con = database.getcon(); PreparedStatement ps = con.prepareStatement(query)) {
		        ps.setInt(1, bookingId);
		        ResultSet rs = ps.executeQuery();
		        
		        if (rs.next()) {
		            // Map the result set to the Booking object
		            booking = new Booking(
		                rs.getInt("bookingId"),
		                rs.getString("customerName"),
		                rs.getDate("pickupDate").toLocalDate(),
		                rs.getString("vc"),
		                rs.getInt("contactNumber"),
		                rs.getInt("kmRun"),
		                rs.getDouble("pricePerKm"),
		                rs.getDouble("totalCost")
		            );
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return booking;
		}

		
		
		
		
		
		
		
		
		
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v.i.p_software;

import java.sql.PreparedStatement;

/**
 *
 * @author David Wainaina
 */
public class CreateBookingControl {
    java.sql.Connection conn = null;
    String [] details=new String[9];
    
    public CreateBookingControl(){
        connect();
        
        
    }
    //Method connects to the database
    public void connect(){
        try {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	conn = java.sql.DriverManager.getConnection(
	"jdbc:mysql://localhost/Bookings?user=root&password=");
	
	}
	catch (Exception e) {
		System.out.println(e);
                System.out.println("Could not connect");
		System.exit(0);
	}	
	System.out.println("Connection established");
        
    }
    //This method will add booking details into the database
    public void book(){
        try{
        PreparedStatement p=conn.prepareStatement("Insert Into Booking set TicketNo=?, FirstName=? ,SurName =?,Phone=?,"
                + " Email=?,Gender=?,Travel=?,Departure=?,Price=?");
    p.setString(1,details[0]);
    p.setString(2,details[1]);
    p.setString(3,details[2]);
    p.setString(4,details[3]);
    p.setString(5,details[4]);
    p.setString(6,details[5]);
    p.setString(7,details[6]);
    p.setString(8,details[7]);
    p.setDouble(9,Double.parseDouble(details[8]));
    
    
   
    System.out.println("I tried to insert into db");
    p.execute();  //use execute if no results expected back
    }catch(Exception e){
        System.out.println("Error"+e.toString());
        return;        
    }
        
    }
    
    //Sets the array values outside this class.
    public void setValues(int index,String ob){
        details[index]=ob;
    }
    
}

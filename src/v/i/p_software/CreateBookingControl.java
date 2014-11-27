/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v.i.p_software;



import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author David Wainaina
 */
public class CreateBookingControl {
    java.sql.Connection conn = null;
    String [] details=new String[11];
    Date ticketDate=null;
    
    PersonCrud personDB = new PersonCrud();
    
    public CreateBookingControl(){
        connect();
        
        
    }
    //Method connects to the database
    public void connect(){
        try {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	conn = java.sql.DriverManager.getConnection(
	"jdbc:mysql://localhost/Bookings?user=root&password=Ashesi@2016?");
	
	}
	catch (Exception e) {
		System.out.println(e);
                System.out.println("Could not connect");
		System.exit(0);
	}	
	System.out.println("Connection established");
        
    }
    //This method will add booking details into the database
    public void book() throws ParseException{
        try{
        PreparedStatement p=conn.prepareStatement("Insert Into Booking set TicketNo=?, FirstName=? ,SurName =?,Phone=?,"
                + " Email=?,Gender=?,Travel=?,Departure=?,Price=?,Traveldate=?, Age=?");
    p.setString(1,details[0]);//tid
    p.setString(2,details[1]);//fname
    p.setString(3,details[2]);//sname
    p.setString(4,details[3]);//phone
    p.setString(5,details[4]);//email
    p.setString(6,details[5]); //gender
    p.setString(7,details[6]);//jourey
    p.setString(8,details[7]);//time
    p.setDouble(9,Double.parseDouble(details[8])); //price
    
    //fn, sn, id, pn,g,e,age
//    Person createdPerson = new Person(details[1], details[2], details[0], details[3], details[5], details[4]);
//    personDB.addPerson(createdPerson);
    
     SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
        Date parsed = format.parse(details[9]); 
        java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
    
   
    p.setDate(10,sqlDate); //date
    p.setInt(11, Integer.parseInt(details[10])); //age
    
 
    
   
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
    
    //Method to setDate;
    public void setDate(Date d){
        ticketDate=d;
    }
    
}

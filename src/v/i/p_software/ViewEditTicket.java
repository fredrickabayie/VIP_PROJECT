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
public class ViewEditTicket {
    java.sql.Connection conn = null;
    String view=null;
    String [] info=new String[9];
    
    
    //Constructor starts a connection upon creation of ViewEditTicket instance
    public ViewEditTicket(){
        connect();
    }
    //Method to connect to the database
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
  
    
    //Method to Get the Ticket when requested for view
    public void getTicket(){
        try {
		java.sql.Statement s = conn.createStatement();
		java.sql.ResultSet r = s.executeQuery("SELECT * FROM booking where TicketNo="+view+";");
		while(r.next()) {
			
                               info[0]=r.getString("TicketNo");
                               info[1]=r.getString("FirstName");
                               info[2]=r.getString("Surname"); 
                               info[3]=r.getString("Phone");
                               info[4]=r.getString("Email");
                               info[5]=r.getString("Gender");
                               info[6]=r.getString("Travel");
                               info[7]=r.getString("Departure");
                               info[8]=r.getString("Price");
                                     
                                                   
		}
         s.close();       
	}
	catch (Exception e) {
		System.out.println(e);
		System.exit(0);
	}
        
    }
    
    //Method to set ticket to be searched. Call this method in the view class and give it the ticket id
    public void searchTicket(String s){
        view=s;
    }
    
    //method to update the database after editing
    public void update(){
        
                	try{
                            System.out.println("The view is: "+view +" And info: "+info[1]);
                            String query="update booking set TicketNo=?, FirstName=? ,SurName=?,Phone=?,Email=?,Gender=?,Travel=?,Departure=?,Price =?,where TicketNo ="+view+";";
    PreparedStatement p=conn.prepareStatement(query);
    p.setString(1,info[0]);
    p.setString(2,info[1]);
    p.setString(3,info[2]);
    p.setString(4,info[3] );
    p.setString(5,info[4] );  
    p.setString(6,info[5] );
    p.setString(7,info[6] );
    p.setString(8,info[7] );
    p.setDouble(9,Double.parseDouble(info[8]) );
    System.out.println("The view is: "+view +" And info2: "+info[1]);
    System.out.println("I tried to Update db");
    p.execute();  //use execute if no results expected back
    p.close();
    }catch(Exception e){
        System.out.println("Error"+e.toString());
        return;        
    }
    }
    
    //Method to set Values in the array. Its used outside this class when setting the array values
    public void setInfo(int index, String s){
        info[index]=s;
    }
}

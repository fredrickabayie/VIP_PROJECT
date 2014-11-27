/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v.i.p_software;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static v.i.p_software.ADMIN_INTERFACE.admin_table;
import static v.i.p_software.ADMIN_INTERFACE.table_model;

/**
 *
 * @author chokayg3
 */
public class Admin_Controller {
    Connection connection;    
    
    public void initialize()
    {
         try
        {
            Class.forName ( "com.mysql.jdbc.Driver" ).newInstance ( );
             connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/bookings?user=root&password=Ashesi@2016?");
             JOptionPane.showMessageDialog(null, "Successfully Connected To The DataBase", "Connected", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e )
        {
            JOptionPane.showMessageDialog(null, "Failed To Connect To The DataBase", "Not Connected", JOptionPane.ERROR_MESSAGE);
            System.out.println ( "Not Connected " + e.toString ( ) );
        }//End Of Catch
    }
    
    public void display()
    {
        table_model.setRowCount(0);        
        try 
        {
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( "SELECT * FROM booking" );
         while ( resultSet.next ( ) )
         {
             Object [] w = {resultSet.getString ( "TicketNo" ),resultSet.getString ( "FirstName" ),resultSet.getString ( "SurName" ),
             resultSet.getString ( "Phone" ),resultSet.getString ( "Email" ), resultSet.getString ( "Gender" ),resultSet.getString ( "Travel" ),
             resultSet.getString ( "Departure" ),resultSet.getString ( "Price" ),resultSet.getString ( "Traveldate" ),resultSet.getString ( "Age" )};
             ADMIN_INTERFACE.table_model.addRow(w);
             //System.out.println(table_model.getRowCount());
         }//End Of While
         JOptionPane.showMessageDialog(null, "Successfully Dispalyed The Data In The DataBase", "Displayed", JOptionPane.INFORMATION_MESSAGE);     
         
        }//End Of Try
        catch ( SQLException e ) 
        {
        JOptionPane.showMessageDialog(null, "Failed To Display The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }
    
    public void delete()
    {
            int row=admin_table.getSelectedRow();
        int deleteThis=Integer.parseInt((String)admin_table.getValueAt(row,0));
         try
        {
            PreparedStatement pStatement = connection.prepareStatement ( "Delete From booking Where TicketNo="+deleteThis+";" );
           // for (int i = 0; i < table_model.getRowCount(); i++)
           // {
           // pStatement.setString( 1, (String) admin_table.getValueAt(i,0) );
           // pStatement.executeUpdate( );
            pStatement.execute();
           //}//End Of For
        JOptionPane.showMessageDialog(null, "Successfully Deleted The Data From The DataBase", "Deleted", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Failed To Delete The Data From The DataBase", "Not Deleted", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }
    
    public void deleteRow()
    {
         if ( admin_table.getSelectedRow ( ) >= 0 )
            ADMIN_INTERFACE.table_model.removeRow ( admin_table.getSelectedRow ( ) );
    }
    
    public void update()
    {
         try
        {
            PreparedStatement pStatement = connection.prepareStatement("Update booking set FirstName=? ,SurName=?,Phone=?, "
                    + "Email=?,Gender=?,Travel=?,Departure=?,Price=?,Traveldate=?, Age=? where TicketNo=?");
            
         for ( int i = 0; i < table_model.getRowCount(); i++ )
            {
            
            pStatement.setString ( 1, (String) admin_table.getValueAt(i,1) );
            pStatement.setString ( 2, (String) admin_table.getValueAt(i,2) );
            pStatement.setString ( 3, (String) admin_table.getValueAt(i,3) );
            pStatement.setString ( 4, (String) admin_table.getValueAt(i,4) );
            pStatement.setString ( 5, (String) admin_table.getValueAt(i,5) );
            pStatement.setString ( 6, (String) admin_table.getValueAt(i,6) );
            pStatement.setString ( 7, (String) admin_table.getValueAt(i,7) );
            pStatement.setString ( 8, (String) admin_table.getValueAt(i,8) );
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse( (String) admin_table.getValueAt(i, 9)); 
            java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
            System.out.println((String)admin_table.getValueAt(i, 9));
        
            pStatement.setDate ( 9, sqlDate );
            pStatement.setInt ( 10, Integer.parseInt((String)admin_table.getValueAt(i,10)) );
            pStatement.setString ( 11, (String) admin_table.getValueAt(i,0) );
            System.out.println((String)admin_table.getValueAt(i, 0));
            System.out.println((String)admin_table.getValueAt(i, 10));
            pStatement.executeUpdate ( );
            pStatement.execute();
            }//End Of For
            JOptionPane.showMessageDialog(null, "Successfully Updated The Data To The DataBase", "Updated", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println("the error"+e.toString());
            JOptionPane.showMessageDialog(null, "Failed To Update The Data To The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ADMIN_INTERFACE.class.getName()).log(Level.SEVERE, null, ex);
        }//End Of Catch
    }
    
    public void insert()
    {
         try
        {
            PreparedStatement pStatement = connection.prepareStatement("Insert into booking set TicketNo=?, FirstName=? ,SurName=?,Phone=?,"
                    + "Email=?,Gender=?,Travel=?,Departure=?,Price=?,Traveldate=?, Age=?");
            
         for ( int i = 0; i < table_model.getRowCount();i++)
            {
                System.out.println(table_model.getRowCount() + "doing this row ");
            pStatement.setString ( 1, (String) admin_table.getValueAt(i,0) );
            System.out.println("this is ha!! "+i);
            pStatement.setString ( 2, (String) admin_table.getValueAt(i,1) );
            pStatement.setString ( 3, (String) admin_table.getValueAt(i,2) );
            pStatement.setString ( 4, (String) admin_table.getValueAt(i,3) );
            pStatement.setString ( 5, (String) admin_table.getValueAt(i,4) );
            pStatement.setString ( 6, (String) admin_table.getValueAt(i,5) );
            pStatement.setString ( 7, (String) admin_table.getValueAt(i,6) );
            pStatement.setString ( 8, (String) admin_table.getValueAt(i,7) );
            pStatement.setString ( 9, (String) admin_table.getValueAt(i,8) );

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse( (String) admin_table.getValueAt(i, 9)); 
            java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
            pStatement.setDate ( 10, sqlDate );
            pStatement.setInt ( 11, Integer.parseInt((String)admin_table.getValueAt(i,10)) );
            try{
            pStatement.execute();
            System.out.println("Inserted this " + i );
            } catch(Exception e){
                
            }
            }//End Of For
            JOptionPane.showMessageDialog(null, "Successfully Updated The Data To The DataBase", "Updated", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println("the error"+e.toString());
            JOptionPane.showMessageDialog(null, "Failed To Update The Data To The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ADMIN_INTERFACE.class.getName()).log(Level.SEVERE, null, ex);
        }//End Of Catch
    }
    
    public void clearTable()
    {
        table_model.setRowCount(0);
    }
    
    public void addRow()
    {
        if ( admin_table.getSelectedRow ( ) >= 0 )
        table_model.insertRow ( admin_table.getSelectedRow ( ), new Vector ( ) );
        else
        table_model.addRow ( new Vector( ) );
    }
}

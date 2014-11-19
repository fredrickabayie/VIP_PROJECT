package v.i.p_software;


import java.sql.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Agatha Maison
 */
public class RouteTable {
    static DefaultTableModel routeTab; 
    java.sql.Connection conn = null;
    
    public RouteTable(){
        routeTab = new DefaultTableModel(new Object [][] {},
            new String []{"FROM", "TO", "TIME", "PRICE"});
    }
       
      //connection to database
      public void initialize(String dbname, String username, String password){ 
            try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  conn = java.sql.DriverManager.getConnection(
                                                              "jdbc:mysql://localhost/"+dbname+"?user="
                          +username+"&password="+password);                  
            }
            catch (Exception e) {
                  System.out.println(e);
                  System.exit(0);
            } 
            System.out.println("Connection established");
      }
    
    //display routes in database
      public void retrieveRoute(){
          try {
            Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                                     ResultSet.CONCUR_UPDATABLE);
            java.sql.ResultSet r = s.executeQuery("SELECT * FROM route");//all products   
            
            while(r.next()) {
                        routeTab.addRow (new VIPRoute(r.getString("BEGINNING"),r.getString("DESTINATION"),
                                r.getString("DURATION"),r.getDouble("PRICE")).toArray());
              }
            
          }catch(Exception e)
          {System.out.println(e.toString()+"error result0"); }  
      }
            
      //get from and to
      public Object getValueFromSelection(int row, int column)
      {
          return routeTab.getValueAt(row,column);
      }
    //addrow
//    public void addRow(String fro, String to, String tim, double pri)
//    {      
//        routeTab.addRow(new VIPRoute(fro, to, tim, pri).toArray());
//    }    
    
    //delete row
    public void deleteRow(int index)
    {
        routeTab.removeRow(index);
    }
    
    //edit cell
    public void editCell(Object val, int row, int col)
    {
        routeTab.setValueAt(val, row, col);
    }
    //edit 
    //read from route table in the database and display in a table
}

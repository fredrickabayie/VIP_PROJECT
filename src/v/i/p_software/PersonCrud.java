/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v.i.p_software;

/**
 *
 * @author michaelannor
 */

/* unzip the mysql-connector-java-3.1.11-bin.jar file. Place the com folder (and org) folder in same directory as this file
*/

import java.util.*;
import java.io.*;
import java.sql.*;

public class PersonCrud {
    
    java.sql.Connection conn = null;

    public void listAll(){
 try {
  java.sql.Statement s = conn.createStatement();
  java.sql.ResultSet r = s.executeQuery("SELECT * FROM person");
  while(r.next()) {
   System.out.println (
    r.getInt("person_id") + " \t" +
    r.getString("firstname") + " \t" +
    r.getString("lastname") + " \t" +
    r.getInt("age") + " \t" +
    r.getInt("telno") + " \t" +
    r.getChar("gender") + " \t" +
    r.getString("email") );
  }
 }
 catch (Exception e) {
  System.out.println("Error" + e.toString());
  //System.exit(0);
 }
}    

public void addPerson(Person pers){
        //int id, string fn, string ln, int age, int telno
 try{
    PreparedStatement p= DBCudView.conn.prepareStatement("Insert Into person set person_id=?, "
            + "firstname=?, lastname=? ,age =?, telno =?, gender =?, email =?");
    p.setInt(1, pers.getID());
    p.setString(2, pers.getFirstName());
    p.setString(3, pers.getSurname());
    p.setInt(4, pers.getAge());
    p.setInt(5, pers.getPhoneNumber());
    p.setChar(6, pers.getGender());
    p.setString(7, pers.getEmail());
    p.execute();  //use execute if no results expected back
    }catch(Exception e){
        System.out.println("Error"+e.toString());
        //dialog
        return;        
    }
}


public void updatePerson(Person pers){
    int oldKey = Integer.parseInt(pers.getID);
      
    try{
    PreparedStatement p= DBCudView.conn.prepareStatement("Update person set person_id=?, "
            + "firstname=?, lastname=? ,age =?, telno =?, gender =?, email =? Where person_id=?");
   p.setInt(1, pers.getID());
    p.setString(2, pers.getFirstName());
    p.setString(3, pers.getSurname());
    p.setInt(4, pers.getAge());
    p.setInt(5, pers.getPhoneNumber());
    p.setChar(6, pers.getGender());
    p.setString(7, pers.getEmail());

    //figure out how to do where:
    p.setInt(8, oldKey);
    p.execute();  //use execute if no results expected back
    }catch(Exception e){
        System.out.println("Error"+e.toString());
        //dialog
        return;        
    }
    
}

public void deletePerson(Person pers){
    
 try{
    PreparedStatement p= DBCudView.conn.prepareStatement("Delete from person Where person_id=?");
    p.setInt(1, pers.getID);
    p.execute();  //use execute if no results expected back
    
    
    }catch(Exception e){
        System.out.println("Error"+e.toString());
        //dialog
        return;        
    }
}


}
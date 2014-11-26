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
  java.sql.ResultSet r = s.executeQuery("SELECT * FROM products");
  while(r.next()) {
   System.out.println (
    r.getString("Name") + " \t" +
    r.getString("price") + " \t" +
    r.getString("manufacturer") );
  }
 }
 catch (Exception e) {
  System.out.println(e);
  System.exit(0);
 }
}
    
}

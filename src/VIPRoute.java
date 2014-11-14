/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class VIPRoute {
  /**
   * DEclaring instance variables
   */
    private String to;
    private String from;
    private String time;
    private double price;
    
    /**
     * constructor
     * @param fro represents where the passenger boards the bus from
     * @param to represents the final bus stop of the bus
     * @param tim represents time take off time
     * @param pr  represents cost of trip
     */
    public VIPRoute(String fro, String to, String tim, double pr)
    {        
        from = fro;
        this.to = to;
        time = tim;
        price = pr;
    }
    
    /**
     * sets the time
     * @param tim 
     */
    public void setTime(String tim)
    {
        time = tim;
    }
    
    /**
     * 
     * @param fr 
     */
    public void setFrom(String fr)
    {
        from = fr;
    }
    /**
     * 
     * @param t 
     */    
    public void setTo(String t)
    {
        to = t;
    }
    
    /**
     * 
     * @param pri 
     */
    public void setPrice(double pri)
    {
        price = pri;
    }
    
    public String getTime()
    {
        return time;
    }
    
    public String getTo()
    {
        return to;
    }
    
    public String getFrom()
    {
        return from;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public Object[] toArray()
    {
        Object [] arr = {getFrom(), getTo(), getTime(), getPrice()};
        return arr;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

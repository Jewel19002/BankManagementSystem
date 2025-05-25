
package bank.management.system;

import java.sql.*; //import sql library

public class Conn {
    
    /*
    JD basic Connectivity
    1.Register the Driver
    2.Create Connection
    3.Create Statement
    4.Execute Query
    5.Close Connection
    */
    
    
    //For 2.Create Connection 
        Connection c; // Global Object
        Statement s; //Statement declare For 3.Create Statement
        
    //1.Create Connection
    public Conn(){
        
        
        
        try{
            
            /* Class.forName(com.mysql.cj.jdbc.Driver); //For 1.Driver Register */
            //nowdays java automatically pic library through classpath that's why we dont register drive explicitly
            
            
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Jewel@00"); //Connection String
            s=c.createStatement();
            
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

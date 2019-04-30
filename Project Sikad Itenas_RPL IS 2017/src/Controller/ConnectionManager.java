/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dhycong
 */
public class ConnectionManager {
    private Connection con;
    
    private String Driver ="com.mysql.jdbc.Driver";
    private String url ="jdbc:mysql://localhost:3306/akademik";
    private String Username ="root";
    private String Password ="";
    
    public Connection LogOn(){
        try{
            Class.forName(Driver).newInstance();
            con=DriverManager.getConnection(url, Username, Password);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
    
    public void LogOff(){
        try{
            con.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}

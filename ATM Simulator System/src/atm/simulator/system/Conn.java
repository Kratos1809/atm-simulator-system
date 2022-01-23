/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;

import java.sql.*;

/**
 *
 * @author rajiul
 * this class uses sql package for java allowing us to
 * select , insert, delete , update data in SQL tables
 */

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project1","root","");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}

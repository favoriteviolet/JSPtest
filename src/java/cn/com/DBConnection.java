/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DBConnection {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsys", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public static void colseResource(ResultSet rs,Statement s,Connection c){
        if(rs!=null){
            try{
                rs.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        if(s!=null){
            try{
                s.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        if(c!=null){
            try{
                c.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}

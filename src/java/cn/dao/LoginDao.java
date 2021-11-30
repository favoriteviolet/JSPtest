/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.dao;

import cn.com.DBConnection;
import cn.po.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class LoginDao {

    public boolean validateLogin(User user) {
        boolean s = false;
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = DBConnection.getConnection();
            ps = c.prepareStatement("select * from tb_manager where name=? and PWD=?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getRow() == 1) {
                System.out.println(rs.getRow() + "true");
                s = true;
            } else {
                System.out.println(rs.getRow() + "false");
                s = false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            DBConnection.colseResource(rs, ps, c);
        }
        return s;
    }
}

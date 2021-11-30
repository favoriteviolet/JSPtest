/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.dao;

import cn.com.DBConnection;
import cn.dto.LibraryDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class LibraryDao {

    public List<LibraryDto> getLibraryDto() {
        List<LibraryDto> dto = new ArrayList<LibraryDto>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            c = DBConnection.getConnection();
            ps = c.prepareStatement("select * from tb_library ");
            rs = ps.executeQuery();
            LibraryDto lib = null;
            while (rs.next()) {
                lib = new LibraryDto();
                lib.setId(Integer.valueOf(rs.getInt("id")));
                lib.setLibraryname(rs.getString("libraryname"));
                lib.setCurator(rs.getString("curator"));
                lib.setTel(rs.getString("tel"));
                lib.setAddress(rs.getString("address"));
                lib.setEmail(rs.getString("email"));
                lib.setUrl(rs.getString("url"));
                lib.setCreateDate(rs.getString("createDate"));
                lib.setIntroduce(rs.getString("introduce"));
                dto.add(lib);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnection.colseResource(rs, ps, c);
        }

        return dto;
    }

}


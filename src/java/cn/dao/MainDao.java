/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.dao;

import cn.com.DBConnection;
import cn.dto.ReaderBorrowSort;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class MainDao {

    public List<ReaderBorrowSort> getReaderBorrowSort() {
        List<ReaderBorrowSort> borrowSorts = new ArrayList<ReaderBorrowSort>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = DBConnection.getConnection();
            ps = c.prepareStatement("select * from readerborrowsortview ");
            rs = ps.executeQuery();
            ReaderBorrowSort rbs = null;
            while (rs.next()) {
                rbs = new ReaderBorrowSort();
                rbs.setBarcode(rs.getString("barcode"));
                rbs.setBookname(rs.getString("bookname"));
                rbs.setTypename(rs.getString("typename"));
                rbs.setName(rs.getString("bookcasename"));
                rbs.setPubname(rs.getString("pubname"));
                rbs.setAuthor(rs.getString("author"));
                rbs.setPrice(rs.getFloat("price"));
                rbs.setBorrownunber(rs.getInt("degree"));
                borrowSorts.add(rbs);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnection.colseResource(rs, ps, c);
        }
        return borrowSorts;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.service;

import cn.dao.MainDao;
import cn.dto.ReaderBorrowSort;
import java.util.List;

/**
 *
 * @author User
 */
public class MainService {
    public List<ReaderBorrowSort>getReaderBorrowSort(){
        return new MainDao().getReaderBorrowSort();
    }
}

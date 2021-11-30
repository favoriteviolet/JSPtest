/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.service;

import cn.dao.LibraryDao;
import cn.dto.LibraryDto;
import java.util.List;

/**
 *
 * @author User
 */
public class LibraryService {
    public List<LibraryDto> getLibraryDto(){
        return new LibraryDao().getLibraryDto();
    }
}

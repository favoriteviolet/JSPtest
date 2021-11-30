/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.service;

import cn.dao.LoginDao;
import cn.po.User;

/**
 *
 * @author User
 */
public class LoginService {
    public boolean validate(User user){
        LoginDao dao = new LoginDao();
        return dao.validateLogin(user);
    }
}

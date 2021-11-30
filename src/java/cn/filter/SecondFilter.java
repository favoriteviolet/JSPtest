/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.filter;

import cn.po.User;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebFilter(filterName = "SecondFilter",urlPatterns = {"/jsp/*"})
public class SecondFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ((HttpServletRequest)request).setCharacterEncoding("utf-8");
        String uri = ((HttpServletRequest)request).getRequestURI();
        System.out.println(uri);
//        if(uri.contains("index.jsp")||uri.contains("LoginController")){
//            chain.doFilter(request, response);
//        }else{
            HttpSession session = ((HttpServletRequest)request).getSession();
            User user = (User) session.getAttribute("user");
//          System.out.println(user);
            if(user != null){
                chain.doFilter(request, response);
            }else{
                ((HttpServletResponse)response).sendRedirect("index.jsp");
            }
//      }
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCharacterEncoding(String utf8) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getRequestURI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

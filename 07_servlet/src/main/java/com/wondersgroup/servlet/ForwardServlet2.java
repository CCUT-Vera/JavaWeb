package com.wondersgroup.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author wei
 */
public class ForwardServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        System.out.println("servlet2拿到所需的参数："+username);

        Object key = request.getAttribute("key");
        System.out.println("查看柜台1是否哟有："+key);

        //处理自己的业务
        System.out.println("servlet2处理自己的业务");
    }
}

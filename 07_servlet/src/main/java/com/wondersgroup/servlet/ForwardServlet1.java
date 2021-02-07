package com.wondersgroup.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author wei
 */
public class ForwardServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //获取请求参数
        String username = request.getParameter("username");
        System.out.println("servlet1拿到所需的参数："+username);
        //给材料办事，并传递
        request.setAttribute("key","柜台1");
        //问路
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/forward2");
        //转发
        requestDispatcher.forward(request, response);
    }
}

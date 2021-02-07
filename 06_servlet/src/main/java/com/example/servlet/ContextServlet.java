package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
/**
 * @Author Wei Tengfei
 * @Description 1、获取 web.xml 中配置的上下文参数 context-param
 *              2、获取当前的工程路径，格式: /工程路径
 *              3、获取工程部署后在服务器硬盘上的绝对路径
 *              4、像 Map 一样存取数据
 * @Date 5:52 下午 2021/2/6
 * @Param
 * @return
 **/

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、获取 web.xml 中配置的上下文参数 context-param
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        System.out.println("username:"+username+";password:"+password);
        //获取当前的工程路径，格式: /工程路径
        System.out.println(context.getContextPath());
        //获取工程部署后在服务器硬盘上的绝对路径
        System.out.println(context.getRealPath("/"));
        System.out.println(context.getRealPath("/css"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

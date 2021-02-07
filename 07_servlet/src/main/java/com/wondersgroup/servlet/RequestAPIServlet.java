package com.wondersgroup.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author wei
 */
public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*request.setCharacterEncoding("utf-8");
//         i. getRequestURI() 获取请求的资源路径
        System.out.println("获取请求的资源路径:"+request.getRequestURI());
//         ii. getRequestURL() 获取请求的统一资源定位符（绝对路径）
        System.out.println("获取请求的统一资源定位符"+request.getRequestURL());
//         iii. getRemoteHost() 获取客户端的 ip 地址
        System.out.println("客户端的 ip 地址"+request.getRemoteHost());
//         iv. getHeader() 获取请求头
        System.out.println("请求头Accept"+request.getHeader("Accept"));
//         v. getParameter() 获取请求的参数
        System.out.println("username:"+request.getParameter("username"));
        System.out.println("password:"+request.getParameter("password"));
//         vi. getParameterValues() 获取请求的参数（多个值的时候使用）
        System.out.println("hobby:"+request.getParameterValues("hobby"));
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(Arrays.asList(hobbies));
        System.out.println("");
//         vii. getMethod() 获取请求的方式 GET 或 POST
        System.out.println("请求的方式"+request.getMethod());
*/
//        两个流同时只能使用一个。
//        使用了字节流，就不能再使用字符流，反之亦然，否则就会报错。
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>response</h1>");
//        response.getOutputStream();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

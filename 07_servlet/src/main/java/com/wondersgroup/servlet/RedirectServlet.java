package com.wondersgroup.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author wei
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("曾到此一游,response1");

        response.sendRedirect("http://localhost:8080/07_servlet/redirect2");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

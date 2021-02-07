package com.example.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description:
 * @author: Wei Tengfei
 * @date: Created in 2021/2/6 3:54 下午
 * @version: v1.0
 */
public class GelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * @Author Wei Tengfei
     * @Description //service是专门用来处理请求和响应的
     * @Date 3:55 下午 2021/2/6
     * @Param [servletRequest, servletResponse]
     * @return void
     **/

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.printf("hello servlet被访问了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

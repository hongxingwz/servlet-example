package com.jianglei.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author jianglei
 * @since 2018/4/18
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> names = getServletConfig().getInitParameterNames();
        while (names.hasMoreElements()) {
            String s = names.nextElement();
            resp.getWriter().write(s);
        }
        resp.getWriter().write("zhe jiu shi wo de ");
    }
}

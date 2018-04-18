package com.jianglei.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author jianglei
 * @since 2018/4/18
 */
@WebServlet(name = "myServlet", urlPatterns = {"/my", "/my1", "/my11"}, loadOnStartup = 1, initParams = {
        @WebInitParam(name = "key1", value = "val1"),
        @WebInitParam(name = "key2", value = "val2"),
        @WebInitParam(name = "key3", value = "val3"),
})
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println(getServletConfig().getServletName() + " init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> names = getServletConfig().getInitParameterNames();
        while (names.hasMoreElements()) {
            String s = names.nextElement();
            resp.getWriter().write(s );
        }
        resp.getWriter().write("zhe jiu shi wo de ni xiang zen mo yang");
    }
}

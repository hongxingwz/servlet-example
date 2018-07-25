package com.jianglei.web;

import com.jianglei.web.servlet.MyServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author jianglei
 * @since 7/25/18
 */
public class MyWebAppInitializer implements  WebAppInitializer{

    @Override
    public void onStartup(ServletContext servletContext) {
        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);
        myServlet.setLoadOnStartup(1);
        myServlet.addMapping("/my");
        System.out.println("MyWebAppInitializer log");
    }
}

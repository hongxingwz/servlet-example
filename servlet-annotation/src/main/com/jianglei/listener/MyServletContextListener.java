package com.jianglei.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author jianglei
 * @since 2018/4/18
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("MyServletContextListener init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

package com.jianglei.listener;

import com.jianglei.filter.MyFilter;
import com.jianglei.servlet.MyServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.util.EnumSet;

/**
 * @author jianglei
 * @since 2018/4/18
 */
@WebListener("servlet context 初始化")
public class InitListener implements ServletContextListener{

    private ServletContext servletContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init");
        servletContext = sce.getServletContext();
        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);
        myServlet.addMapping("/my");
        myServlet.setLoadOnStartup(1);
        myServlet.setInitParameter("key", "val");
        myServlet.setInitParameter("key2", "val2");

        FilterRegistration.Dynamic myFilter = servletContext.addFilter("myFilter", MyFilter.class);
        myFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

        servletContext.addListener(JavaConfigListener.class);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

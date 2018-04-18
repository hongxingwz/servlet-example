package com.jianglei.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author jianglei
 * @since 2018/4/18
 */
public class JavaConfigListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println(servletRequest);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

    }
}

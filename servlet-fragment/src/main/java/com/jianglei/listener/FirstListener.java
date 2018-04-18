package com.jianglei.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author jianglei
 * @since 2018/4/18
 */
@WebListener
public class FirstListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("FirstListener created");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("FirstListener destroyed");
    }
}

package com.jianglei.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author jianglei
 * @since 2018/4/18
 */
@WebListener
public class Fragment2Listener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Fragment2 init");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
    }
}

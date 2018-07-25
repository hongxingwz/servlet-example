package com.jianglei.web;

import javax.servlet.ServletContext;

/**
 * @author jianglei
 * @since 7/25/18
 */
public interface WebAppInitializer {

    void onStartup(ServletContext servletContext);
}

package com.jianglei.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author jianglei
 * @since 2018/4/18
 */
public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("do filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}

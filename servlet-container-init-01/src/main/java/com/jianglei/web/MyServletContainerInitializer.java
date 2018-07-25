package com.jianglei.web;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jianglei
 * @since 7/25/18
 */
@HandlesTypes({WebAppInitializer.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> inits, ServletContext ctx) throws ServletException {
        System.out.println("MyServletContainerInitializer onStartup");
        System.out.println(inits);
        ctx.log(inits.toString());
        Set<WebAppInitializer> initializers = new HashSet<>();
        for (Class<?> init : inits) {
            if ((!init.isInterface() && !Modifier.isAbstract(init.getModifiers()))
                    && WebAppInitializer.class.isAssignableFrom(init)) {
                try {
                    initializers.add((WebAppInitializer) init.newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        if (initializers.isEmpty()) {
            return;
        }
        System.out.println(initializers);
        for (WebAppInitializer initializer : initializers) {
            initializer.onStartup(ctx);
        }
    }
}

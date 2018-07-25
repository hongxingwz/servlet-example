# 项目简介
通过注解添加servlet, filter, listener

## 注解添加servlet
通过注解指定servlet名字，拦截路径，初始化参数
com.jianglei.servlet.MyServlet
```java
@WebServlet(name = "myServlet", urlPatterns = {"/my", "/my1", "/my11"}, loadOnStartup = 1, initParams = {
        @WebInitParam(name = "key1", value = "val1"),
        @WebInitParam(name = "key2", value = "val2"),
        @WebInitParam(name = "key3", value = "val3"),
})
public class MyServlet extends HttpServlet {
    
}
```

## 注解添加filter
可以通过注解指定拦截器的名称，拦截路径，初始化参数等

com.jianglei.filter.MyFilter
```java
@WebFilter(urlPatterns = "/")
public class MyFilter implements Filter {
    
}
```

## 注解添加listener
添加listener则比较简单
com.jianglei.listener.MyServletContextListener
```java
@WebListener
public class MyServletContextListener implements ServletContextListener {
    
}
```

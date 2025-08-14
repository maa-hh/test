package com.example.ipcounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@Component
public class MyInterceptor implements HandlerInterceptor {
    @Autowired
    Ipcounter ipcounter;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("请求前：" + request.getRequestURI());
        // 权限校验示例
      ipcounter.getCounter();
        return true;  // 继续处理
    }
}

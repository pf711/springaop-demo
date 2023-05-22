package com.example.spring.aop.inte.handler;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * @author mengpengfei
 * @create 2023- 05-20-10:12
 */
public class TimeHandler implements MethodBeforeAdvice ,AfterReturningAdvice {
    public void afterReturning(@Nullable Object returnValue, Method method, Object[] args, @Nullable Object target) throws Throwable {
        System.out.println("代理前执行代码：------------------------" + System.currentTimeMillis());
    }

    public void before(Method method, Object[] args, @Nullable Object target) throws Throwable {
        System.out.println("代理后执行代码：--------------------------" + System.currentTimeMillis());
    }
}

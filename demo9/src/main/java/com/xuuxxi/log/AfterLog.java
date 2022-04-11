package com.xuuxxi.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
@Component
public class AfterLog implements AfterReturningAdvice {
    //returnValue：返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + ",返回结果为" + returnValue);
    }
}

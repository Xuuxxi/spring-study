package com.xuuxxi.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */

@Aspect //标注这个类是一个切面
@Component("diy2")
public class DiyPointCut2 {
    @Before("execution(* com.xuuxxi.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("Before...");
    }

    @After("execution(* com.xuuxxi.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("After...");
    }

    //不建议用，还是Before和After拆开写
    //jp代表要处理的切入点
    @Around("execution(* com.xuuxxi.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Before around...");

        //执行方法
        jp.proceed();

        System.out.println("After around...");
    }
}

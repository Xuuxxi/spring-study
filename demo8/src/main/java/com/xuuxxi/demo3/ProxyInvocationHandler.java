package com.xuuxxi.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
        return o;
    }

    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //反射机制
        Object result = method.invoke(rent, args);

        fee();

        return result;
    }

    public void seeHouse(){
        System.out.println("See...");
    }

    public void fee(){
        System.out.println("Fee...");
    }
}

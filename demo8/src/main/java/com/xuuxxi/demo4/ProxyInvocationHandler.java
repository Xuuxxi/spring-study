package com.xuuxxi.demo4;

import com.xuuxxi.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //其余功能
        log(method.getName());
        //反射机制
        //功能实现
        Object result = method.invoke(target, args);

        return result;
    }

    public void log(String msg){
        System.out.println(msg + " 方法");
    }
}

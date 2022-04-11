package com.xuuxxi.demo4;

import com.xuuxxi.demo4.ProxyInvocationHandler;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        //开始代理
        proxy.add();
    }
}

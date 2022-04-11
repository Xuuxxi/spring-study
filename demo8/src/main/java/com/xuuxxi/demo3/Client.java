package com.xuuxxi.demo3;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色（现在没有）
        ProxyInvocationHandler pro = new ProxyInvocationHandler();
        //调用程序角色处理要调用的接口对象
        pro.setRent(host);

        Rent proxy = (Rent) pro.getProxy();
        proxy.rent();
    }
}

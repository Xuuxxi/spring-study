package com.xuuxxi.demo2;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(service);

        proxy.add();
    }
}

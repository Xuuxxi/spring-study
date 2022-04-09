package com.xuuxxi.demo1;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */
public class Client {
    public static void main(String[] args) {
        //房东租房
        Host host = new Host();
        //中介做附加操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}

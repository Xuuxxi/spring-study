package com.xuuxxi.demo1;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */

//中介
public class Proxy implements Rent{
    private Host host;

    public Proxy(){}

    public Proxy(Host host) {
        this.host = host;
    }


    @Override
    public void rent() {
        seeHouse();
        host.rent();
        Sign();
        fee();
    }

    public void seeHouse(){
        System.out.println("See...");
    }

    public void fee(){
        System.out.println("Fee...");
    }

    public void Sign(){
        System.out.println("Sign...");
    }
}

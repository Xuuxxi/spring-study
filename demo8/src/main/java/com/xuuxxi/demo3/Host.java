package com.xuuxxi.demo3;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("Host rent...");
    }
}

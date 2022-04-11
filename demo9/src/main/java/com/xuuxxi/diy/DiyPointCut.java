package com.xuuxxi.diy;

import org.springframework.stereotype.Component;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
@Component("diy")
public class DiyPointCut {
    public void before(){
        System.out.println("Before...");
    }

    public void after(){
        System.out.println("After...");
    }
}

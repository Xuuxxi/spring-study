package com.xuuxxi.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
@Component("UserServiceImpl")
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}

package com.xuuxxi.service.Impl;

import com.xuuxxi.dao.Impl.UserDaoImpl;
import com.xuuxxi.dao.UserDao;
import com.xuuxxi.service.UserService;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/8
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public void getUser(){
        userDao.getUser();
    }
}

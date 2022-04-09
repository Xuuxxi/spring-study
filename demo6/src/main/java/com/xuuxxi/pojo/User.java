package com.xuuxxi.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */


//等价于  <bean id="user" class="com.xuuxxi.pojo.User"/>
@Component
public class User {
    @Value("test")
    private String name;
}

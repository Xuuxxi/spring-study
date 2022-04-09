package com.xuuxxi.config;

import com.xuuxxi.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */
@Configuration
//@ComponentScan    默认开启，也可以自己指定注解生效的包
@Import(MyConfig2.class)    //相当于引入第二个xml文件
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}

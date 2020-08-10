package com.spring.mvc.service;

import org.springframework.stereotype.Service;

/**
 * @author jinglv
 * @date 2020/04/06
 */
@Service
public class HelloService {
    public String sayHello() {
        return "Hello, Spring MVC 开发框架！";
    }
}

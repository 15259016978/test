package com.example.SpringBoot.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: zhen
 * @date: 2021/7/12 14:47
 * @desc:1.2
 */
@Controller
@RequestMapping("/admin")
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello springBoot";
    }
}

package com.wjk.server1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server1Controller {

    @RequestMapping("test01")
    public String test01(){
        System.out.println("=====================");
        return "成功";
    }

}

package com.wjk.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class ZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class);
    }

    @RequestMapping("testzuul")
    public String da(){
        System.out.println("zull网关成功");
        return "okksss";
    }
}

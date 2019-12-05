package com.wjk.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker
@EnableFeignClients
@RestController
public class Server2Application {

    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class);
    }
    @RequestMapping("test41")
    public String test41(){
        System.out.println("====test41====");
        return "OKKKKK";
    }




}

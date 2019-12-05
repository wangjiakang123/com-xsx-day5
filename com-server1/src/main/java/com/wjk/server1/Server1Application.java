package com.wjk.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Server1Application {

    public static void main(String[] args) {
        SpringApplication.run(Server1Application.class);
    }

    @RequestMapping("test42")
    public String test42(){
        System.out.println("====test42====");
        return "OK";
    }


}

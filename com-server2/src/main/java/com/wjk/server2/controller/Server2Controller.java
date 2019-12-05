package com.wjk.server2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wjk.server2.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server2Controller {

    @Autowired
    private TestApi testApis;

    @RequestMapping("test011")
    public String test01(){
        return testApis.test01();
    }


}

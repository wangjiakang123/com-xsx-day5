package com.wjk.server2.api;

import org.springframework.stereotype.Component;

@Component
public class ApiFallback implements TestApi{
    @Override
    public String test01() {
        return "项目出错";
    }
}

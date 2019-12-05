package com.wjk.server2.api;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="ribbon02",fallback = ApiFallback.class)
@Hystrix
public interface TestApi {


    @RequestMapping("test01")
    public String test01();

}

package com.itheima.eurekaresiliencefeignclient.seivice.Impl;

import com.itheima.eurekaresiliencefeignclient.seivice.feignService;
import org.springframework.stereotype.Component;

@Component
public class feignServiceImpl implements feignService {
    @Override
    public String sayHi(String id) {
        return "发生了熔断错误";
    }
}

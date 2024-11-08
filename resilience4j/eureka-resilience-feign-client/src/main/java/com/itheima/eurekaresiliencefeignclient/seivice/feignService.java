package com.itheima.eurekaresiliencefeignclient.seivice;

import com.itheima.eurekaresiliencefeignclient.seivice.Impl.feignServiceImpl;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-provider",fallback = feignServiceImpl.class)
@Service
public interface feignService {

    @GetMapping("/hi")
    public String sayHi(@RequestParam("id") String id);
}

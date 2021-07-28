package icu.bleuweb.eurekaconsumerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: eureka api测试
 * @author: wxy
 * @create: 2021-07-28 14:52
 **/

@RestController
public class FirstController {

    @Autowired
    private DiscoveryClient eurekaConsumer;


    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.eurekaConsumer.getInstances(applicationName);
    }
}

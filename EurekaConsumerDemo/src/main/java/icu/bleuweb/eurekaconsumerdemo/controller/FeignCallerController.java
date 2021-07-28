package icu.bleuweb.eurekaconsumerdemo.controller;

import icu.bleuweb.web.feign.CalleeFeign;
import icu.bleuweb.web.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: call web服务的feign
 * 需要依赖于web 模块
 * @author: wxy
 * @create: 2021-07-28 16:13
 **/
@RestController
public class FeignCallerController {

    @Autowired
    CalleeFeign calleeFeign;

    @GetMapping("/customer/{id}")
    public Customer callFeign(@PathVariable("id") Long id){
        return calleeFeign.getCustomerInfo(id);
    }

}

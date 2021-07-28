package icu.bleuweb.web.feign;

import icu.bleuweb.web.pojo.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @description: feign test
 * @author: wxy
 * @create: 2021-07-28 15:57
 **/


@FeignClient(name = "serviceWeb")
public interface CalleeFeign {

    @RequestMapping(value = "/customer/{id}", method = GET)
    public Customer getCustomerInfo(@PathVariable("id") Long id);

//    @RequestMapping("/objects/", method = POST)
//    public void postInfo(ObjectOfServiceB b);
//
//    @RequestMapping("/objects/{id}", method = PUT)
//    public void postInfo((@PathVariable("id") Long id, ObjectOfBServiceB b);
}


package icu.bleuweb.web.controller;

import icu.bleuweb.web.pojo.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @description: controller for test
 * @author: wxy
 * @create: 2021-07-28 15:59
 **/
@RestController
public class CustomerInstancesController {

    static HashMap<Long, Customer> mockCustomerData = new HashMap();

    static {
        mockCustomerData.put(1L, new Customer(1, "Jane", "DC"));
        mockCustomerData.put(2L, new Customer(2, "John", "SFO"));
        mockCustomerData.put(3L, new Customer(3, "Kate", "NY"));
    }

    @RequestMapping(value = "/customer/{id}", method = GET)
    public Customer getCustomerInfo(@PathVariable("id") Long id) {
        return mockCustomerData.get(id);
    }
}

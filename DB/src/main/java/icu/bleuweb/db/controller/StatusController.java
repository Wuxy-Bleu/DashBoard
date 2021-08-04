package icu.bleuweb.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: test
 * @author: wxy
 * @create: 2021-08-02 10:25
 **/

@RestController
public class StatusController {

    @GetMapping("status")
    public String status(){
        return "on";
    }
}

package icu.bleuweb.eurekaconsumerdemo.controller;

import com.cloudpense.herculesFeign.feign.hercules.ExpClaimSmartbiLinkFeign;
import com.cloudpense.standard.vo.document.config.ExpClaimSmartBiLinkVo;
import icu.bleuweb.web.feign.CalleeFeign;
import icu.bleuweb.web.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    ExpClaimSmartbiLinkFeign feign;

    @GetMapping("/customer/{id}")
    public Customer callFeign(@PathVariable("id") Long id) {
        return calleeFeign.getCustomerInfo(id);
    }

    @GetMapping("test")
    public String call() {
        List<ExpClaimSmartBiLinkVo> byHeaderTypeId = feign.findByHeaderTypeId(1);
        return "ttt";
    }


}

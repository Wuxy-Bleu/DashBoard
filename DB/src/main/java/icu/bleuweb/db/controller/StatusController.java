package icu.bleuweb.db.controller;

import icu.bleuweb.db.mapper.ScoreMapper;
import icu.bleuweb.db.vo.ScoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: test
 * @author: wxy
 * @create: 2021-08-02 10:25
 **/

@RestController
public class StatusController {

    @Autowired
    ScoreMapper scoreMapper;

    @GetMapping("status")
    public String status() {
        return "on";
    }

    @GetMapping("/db")
    public String testDb() {
        return scoreMapper.test();
    }

    @GetMapping("/one/{cno}")
    public ScoreVo getOne(@PathVariable String cno) {
        return scoreMapper.getOne(cno);
    }
}

package icu.bleuweb.db.mapper;

import icu.bleuweb.db.vo.ScoreVo;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: wxy
 * @create: 2021-08-25 19:10
 **/
public interface ScoreMapper {
    public String test();

    public ScoreVo getOne(String cno);
}

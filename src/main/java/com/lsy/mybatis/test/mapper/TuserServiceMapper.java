package com.lsy.mybatis.test.mapper;


import com.lsy.mybatis.test.model.Tuser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by liangsongying on 2017/10/27.
 */

public interface TuserServiceMapper {
    @Select("select * from t_user")
    List<Tuser> selectAll();
}

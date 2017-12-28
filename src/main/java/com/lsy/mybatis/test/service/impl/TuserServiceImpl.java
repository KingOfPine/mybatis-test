package com.lsy.mybatis.test.service.impl;


import com.lsy.mybatis.test.mapper.TuserServiceMapper;
import com.lsy.mybatis.test.model.Tuser;
import com.lsy.mybatis.test.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liangsongying on 2017/10/27.
 */
@Service
public class TuserServiceImpl implements TuserService {
    @Autowired
    private TuserServiceMapper tuserServiceMapper;
    @Override
    public List<Tuser> getAll() {
        return tuserServiceMapper.selectAll();
    }

}

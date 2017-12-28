package com.lsy.mybatis.test.controller;

import com.lsy.mybatis.test.model.Tuser;
import com.lsy.mybatis.test.service.TuserService;
import com.lsy.mybatis.test.utils.PagingQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by liangsongying on 2017/12/27.
 */
@Controller
public class TestController {
    @Autowired
    private TuserService tuserService;

    @ResponseBody
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public PagingQueryResult getAll(@RequestParam Integer limit, @RequestParam Integer offset,
                                    @RequestParam String order){
        List<Tuser> list = tuserService.getAll();
        return new PagingQueryResult(list, 4);
    }
    @ResponseBody
    @RequestMapping("")
    public ModelAndView test2() {
        return new ModelAndView("index");
    }

}

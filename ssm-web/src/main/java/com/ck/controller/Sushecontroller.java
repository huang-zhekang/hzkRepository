package com.ck.controller;

import com.ck.entity.Sushe;
import com.ck.service.suSheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/18 16:03
 */
@Controller
public class Sushecontroller {

    @Autowired
    private suSheService susheservice;

    @GetMapping("queryall")
    @ResponseBody
    public List<Sushe> queryall(){
        return susheservice.queryAll();
    }

}

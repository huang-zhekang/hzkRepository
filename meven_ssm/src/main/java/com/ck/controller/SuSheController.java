package com.ck.controller;

import com.ck.entity.Sushe;
import com.ck.service.SusheService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 9:58
 */
@Controller
public class SuSheController {
    @Autowired
    private SusheService susheService;

    @RequestMapping("querySuSheALL")
    public String QueryAll(ModelMap modelMap){
        List<Sushe> susheList = susheService.queryAll();
        modelMap.put("susheList", susheList);

        return "Sushe";
    }
}

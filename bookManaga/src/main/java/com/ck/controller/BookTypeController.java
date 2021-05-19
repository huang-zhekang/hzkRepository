package com.ck.controller;

import com.ck.entity.booktype;
import com.ck.service.bookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 12:40
 */
@Controller
public class BookTypeController {
    @Autowired
    private bookTypeService bookTypeService;

    @RequestMapping("AddBookQueryType")
    public String AddBookQueryType(ModelMap modelMap){
        List<booktype> booktypeList = bookTypeService.queryAll();
        modelMap.put("booktypeList",booktypeList);
        return "p_add";
    }
}

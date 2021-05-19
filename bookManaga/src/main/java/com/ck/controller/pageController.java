package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:22
 */
@Controller
public class pageController {

    @RequestMapping("page")
    public String page(String page){return page;}
}

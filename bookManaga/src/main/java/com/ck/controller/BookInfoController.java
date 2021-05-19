package com.ck.controller;

import com.ck.entity.bookinfo;
import com.ck.entity.booktype;
import com.ck.service.bookInfoService;
import com.ck.service.bookTypeService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.dc.pr.PRError;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:23
 */
@Controller
public class BookInfoController {
    @Autowired
    private bookInfoService bookInfoService;

    @Autowired
    private bookTypeService bookTypeService;

    //查询所有图书,分页操作
    @RequestMapping("queryBookAll")
    public String queryBookInfoAll(@RequestParam Map map,int page,ModelMap modelMap){

        if(map.get("bname")==null){
            map.put("bname", "");
        }
        if(map.get("btid")==null){
            map.put("btid", 0);
        }

        Page<bookinfo> PageBookinfoList = bookInfoService.queryAll(map,page);
        List<booktype> booktypeList = bookTypeService.queryAll();

        modelMap.put("bookinfoList",PageBookinfoList.getResult());
        modelMap.put("booktypeList",booktypeList);

        modelMap.put("page", PageBookinfoList.getPageNum());
        modelMap.put("SumPage", PageBookinfoList.getPages());
        modelMap.put("pagesum",  PageBookinfoList.getPageSize());

        modelMap.put("m",map);
        return "p_list";
    }

    //添加图书
    @RequestMapping("addBook")
    public String addBook(MultipartFile file, HttpSession session,String time,bookinfo bookinfo){
        String filename = file.getOriginalFilename();

        filename = filename.replace(filename.substring(0, filename.lastIndexOf(".")), UUID.randomUUID().toString());
        bookinfo.setImgurl(filename);

        filename = session.getServletContext().getRealPath("/images/book_img/") + filename;

        try {
            file.transferTo(new File(filename));


            //字符串转换date
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse(time);

            System.out.println(date);
            bookinfo.setDtime(date);

            bookInfoService.add(bookinfo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:queryBookAll?page=1";
    }

    //修改图书状态
    @RequestMapping("updateStateById")
    public String updateStateById(int id){
        bookInfoService.updateBookStateById(id);

        return "redirect:queryBookAll?page=1";
    }

    //删除图书
    @RequestMapping("deleteBookById")
    @ResponseBody
    public String deleteBookById(@RequestParam int[] ids){
        try {
            bookInfoService.deleteBookByIds(ids);
            return "1";
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "0";
    }

}

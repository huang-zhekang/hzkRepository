package com.ck.service.impl;

import com.ck.dao.SusheDao;
import com.ck.entity.Sushe;
import com.ck.service.SusheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 9:57
 */
@Service
public class SusheServiceImpl implements SusheService {

    @Autowired
    private  SusheDao susheDao;


    public List<Sushe> queryAll() {
        return susheDao.queryAll();
    }
}

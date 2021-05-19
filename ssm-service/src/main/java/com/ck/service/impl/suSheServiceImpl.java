package com.ck.service.impl;

import com.ck.dao.SusheDao;
import com.ck.entity.Sushe;
import com.ck.service.suSheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/18 15:32
 */
@Service
public class suSheServiceImpl implements suSheService {

    @Autowired
    private SusheDao sushedao;

    public List<Sushe> queryAll() {
        return sushedao.queryAll();
    }
}

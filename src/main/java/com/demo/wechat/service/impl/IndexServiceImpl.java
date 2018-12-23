package com.demo.wechat.service.impl;



import com.demo.wechat.dao.IndexDao;
import com.demo.wechat.service.IndexService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by user on user
 */

@Service
public class IndexServiceImpl implements IndexService {

    private static final Logger logger = Logger.getLogger(IndexServiceImpl.class);


    @Autowired
    private IndexDao indexDao;



    @Override
    public void index(Map<String, Object> param, Map<String, Object> result) {





        List<Map<String,Object>> list=indexDao.selectIndex(param);


        result.put("list",list);


    }
}

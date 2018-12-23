package com.demo.wechat.controllers;




import com.demo.wechat.annotation.PriCheckRequired;
import com.demo.wechat.service.IndexService;
import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Path("/")
@PriCheckRequired
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class);


    @Autowired
    private IndexService indexService;

    @Get
    public Object index(Invocation inv){


        logger.info("index");





        Map<String,Object> param=new HashMap<String,Object>();
        Map<String,Object> result=new HashMap<String,Object>();


        indexService.index(param,result);



        return "index";
    }









}

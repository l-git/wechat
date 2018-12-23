package com.demo.wechat.controllers.wechat.jssdk;

import net.paoding.rose.web.annotation.rest.Get;
import org.apache.log4j.Logger;

/**
 * Created by Galapagos on 2018/12/23.
 */
public class JsSdkController {


    private static final Logger logger= Logger.getLogger(JsSdkController.class);

    @Get
    public Object index(){

        logger.debug("111");

        return "index";
    }




}

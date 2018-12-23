package com.demo.wechat.controllers.wechat;


import com.demo.wechat.annotation.PriCheckRequired;
import com.demo.wechat.service.WechatService;
import com.demo.wechat.utils.WeChatUtil;
import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.annotation.rest.Post;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@PriCheckRequired
public class WechatController {


    private final Logger logger = Logger.getLogger(WechatController.class);


    @Autowired
    private WechatService wechatService;


    @Get
    public Object get(Invocation inv){

        logger.info("================================");
        String signature=inv.getParameter("signature");
        String timestamp=inv.getParameter("timestamp");
        String nonce=inv.getParameter("nonce");
        String echostr=inv.getParameter("echostr");
        logger.info("\n?signature="+signature+"&timestamp="+timestamp+"&nonce="+nonce+"&echostr="+echostr);
        if(WeChatUtil.checkSignature(signature, timestamp, nonce)){
            logger.info("request is from WeChat server!");
            return "@"+echostr;
        }
        logger.info("request is not from WeChat server!");
        return "@request is not from WeChat server!";



    }





    @Post
    public Object post(Invocation inv){


        try{

            Map<String,Object> result=new HashMap<String,Object>();
            wechatService.process(inv.getRequest(),result);


            return "@"+result.get("responseMsg");
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e);
        }

        return "@";
    }







}

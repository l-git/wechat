package com.demo.wechat.service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


public interface WechatService {



    void process(HttpServletRequest httpServletRequest, Map<String, Object> result);





}

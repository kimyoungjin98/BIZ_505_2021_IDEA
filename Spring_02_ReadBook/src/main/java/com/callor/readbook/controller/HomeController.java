package com.callor.readbook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    // @Value("${props.username}")
    private String userName;
    // @Value("${props.password}")
    private String password;
    // @Value("${props.driver}")
    private String className;
    // @Value("${props.url}")
    private String url;

    @ResponseBody
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home(){

        logger.debug("여기는 홈 입니다");

        return "";
    }

    @RequestMapping(value="/book", method = RequestMethod.GET)
    public String book(){

        return "book/list";
    }

    @RequestMapping(value="/write", method = RequestMethod.GET)
    public String write(){

        return "read/write";
    }

}

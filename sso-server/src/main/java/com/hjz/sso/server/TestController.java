package com.hjz.sso.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by szjw on 2018/5/19.
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @ResponseBody
    @RequestMapping("/demo")
    public String demo(){
        System.out.println("--------------------");
        return "demo success";
    }
    @RequestMapping("/demo1")
    public String demo1(){
        System.out.println("=================demo1");
        return "login";
    }


}

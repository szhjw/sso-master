package com.hjz.sso.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by szjw on 2018/5/19.
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/demo")
    public String demo(){
        System.out.println("--------------------");
        return "demo success";
    }
}

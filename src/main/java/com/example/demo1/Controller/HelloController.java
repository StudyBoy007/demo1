package com.example.demo1.Controller;

import com.example.demo1.Service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Create by czq
 * time on 2020/5/19  17:21
 */
@Controller
public class HelloController {
    @Resource
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return helloService.add();
    }


}

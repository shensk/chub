package com.shensk.web.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shensk.web.rpc.api.EchoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public void index(){
        System.out.println(echoService.echo("张三"));
    }
}

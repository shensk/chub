package com.shensk.web.rpc.service.impl;

import com.shensk.web.rpc.api.EchoService;
import com.alibaba.dubbo.config.annotation.Service;


@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService{
    public String echo(String str) {
        return "Hello " + str;
    }
}

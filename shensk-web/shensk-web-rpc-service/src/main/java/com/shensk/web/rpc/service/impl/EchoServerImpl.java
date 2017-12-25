package com.shensk.web.rpc.service.impl;

import com.shensk.dao.mapper.UserMapper;
import com.shensk.web.rpc.api.EchoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService{

    @Autowired
    private UserMapper userMapper;

    public String echo(String str) {
//        User User = userMapper.getOne(1L);
        return "hello" + str;
    }
}

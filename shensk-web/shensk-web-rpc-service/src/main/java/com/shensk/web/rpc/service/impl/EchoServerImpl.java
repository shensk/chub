package com.shensk.web.rpc.service.impl;

import com.shensk.web.dao.mapper.UserMapper;
import com.shensk.web.dao.model.User;
import com.shensk.web.rpc.api.EchoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public String echo(String str) {
        User user = userMapper.getOne(1L);
        return user.toString();
    }
}

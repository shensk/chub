package com.shensk.web.rpc.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.shensk.web.dao.mapper.ZhiHuMapper;
import com.shensk.web.dao.model.ZhiHu;
import com.shensk.web.rpc.api.ZhiHuService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Demo class
 *
 * @author shenshaokuai
 * @date 2018/3/4
 */
@Service(version = "1.0.0")
public class ZhiHuServiceImpl implements ZhiHuService{

    @Autowired
    private ZhiHuMapper zhiHuMapper;

    @Override
    public ZhiHu getDetailByZid(Integer zid) {
        return zhiHuMapper.selectByPrimaryKey(zid);
    }
}

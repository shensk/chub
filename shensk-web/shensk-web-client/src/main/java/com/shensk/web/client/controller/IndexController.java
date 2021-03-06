package com.shensk.web.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shensk.common.base.BaseController;
import com.shensk.web.dao.model.ZhiHu;
import com.shensk.web.rpc.api.EchoService;
import com.shensk.web.rpc.api.ZhiHuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController extends BaseController{

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @Reference(version = "1.0.0")
    private ZhiHuService zhiHuService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        ZhiHu zhiHu = zhiHuService.getDetailByZid(1330);
        System.out.println(zhiHu.toString());
        model.addAttribute("base","123456");
        return thymeleaf("/index");
    }
}

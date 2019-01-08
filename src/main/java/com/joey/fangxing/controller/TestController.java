package com.joey.fangxing.controller;

import com.joey.fangxing.mapper.MemberMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private MemberMapper memberMapper=null;

    @RequestMapping("/one")
    public Map testdb(){
        return memberMapper.findObjectById(1);
    }
}

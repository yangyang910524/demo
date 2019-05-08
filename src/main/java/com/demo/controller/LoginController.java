package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yangyang
 * @description 登录管理
 * @create 2019-04-22 10:27
 **/
@Controller
@RequestMapping(value = "")
public class LoginController {

    @RequestMapping(value = {"","login"})
    public String login(HttpServletRequest request, HttpServletResponse response, Model model, String loginName, String password) throws ServletRequestBindingException,Exception{
        System.out.println("111");
        return "views/login";
    }
}
package com.chuchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        //具体的业务，这里简单点指定用户
        if(("admin".equals(username) && "123456".equals(password)) || ("初晨".equals(username) && "Kfb000419".equals(password))){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            //告诉用户登陆失败
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }
    //退出登陆
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "index";
    }
}

package com.chuchen.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的连接
        String language = request.getParameter("l");
        Locale locale = Locale.getDefault();  //如果没有就是用默认的
        if(!StringUtils.isEmpty(language)){
            //请求的连接不为空，
            String[] split = language.split("_");
            //获得的是国家地区
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}

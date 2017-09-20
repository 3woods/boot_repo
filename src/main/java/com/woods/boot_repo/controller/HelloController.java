package com.woods.boot_repo.controller;
/**
 * Hello World for Spring Boot
 */

import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
	public String hello(Locale locale, Model model) {
		return "hello world";
	}
    
    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
//    @RequestMapping("/login")
//    public String login(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        return username+"   "+password;
//    }
}
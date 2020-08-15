package com.demo.thymeleaf.controller;

import com.demo.thymeleaf.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.HashMap;

/**
 * @author Srd
 * @date 2020/8/14  1:40
 */
@Controller
public class HelloThymeleaf {

    @GetMapping("show1")
    public String show1(Model model){
        model.addAttribute("msg","Hello Thymeleaf");
        return "hello1";
    }

    @GetMapping("show2")
    public String show2(Model model){
        User user = new User();
        user.setName("Tom");
        user.setAge(10);
        user.setSex(0);
        user.setFriend(new User("Jerry",9,1));
        model.addAttribute("user",user);
        return "hello2";
    }

    @GetMapping("show3")
    public String show3(Model model){
        model.addAttribute("today", new Date());
        return "hello3";
    }

    @GetMapping("show4")
    public String show4(Model model){
        User user = new User();
        user.setName("Carey");
        user.setAge(20);
        user.setSex(0);
        user.setRole("admin");
        model.addAttribute("user",user);
        return "hello4";
    }

    @GetMapping("show5")
    public String show5(Model model){
        HashMap<String, String> maps = new HashMap<>();
        maps.put("1","Java");
        maps.put("2","JavaScript");
        maps.put("3","MySQL");
        maps.put("4","Spring Boot");
        maps.put("5","Python");
        model.addAttribute("maps",maps);
        return "hello5";
    }
}

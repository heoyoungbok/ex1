package com.example.ex1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/hello2")
    public String hello2(Model model){
        String var1 = "안녕하세요";
        ExDTO exDTO = new ExDTO();
        exDTO.setName("손흥민");
        exDTO.setAddress("영국 런던");
        exDTO.setAge(30);
        model.addAttribute("param1",var1);
        model.addAttribute("param2",exDTO);
        return "hello2";
    }
}


package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by qqqqwww on 04/07/2017.
 */

@Controller
public class Control {

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("mesaj", "MEsah din controller");
        return "indx";
    }
}

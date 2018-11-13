package com.seb.springfragment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/2")
    public String page2(){
        return "page2";
    }
    @RequestMapping("/3")
        public String page3(){
            return "page3";
        }
    }

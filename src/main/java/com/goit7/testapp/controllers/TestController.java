package com.goit7.testapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class TestController {
    @GetMapping("/test")
    public ModelAndView getName() {
        ModelAndView result = new ModelAndView("test");
        result.addObject("test", LocalDateTime.now());
        return result;
    }
}

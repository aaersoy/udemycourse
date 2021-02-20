package com.example.udemycourse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
public class MainController {


    @RequestMapping("/")
    public ModelAndView homePage(){
        Map<String, Object> model=new HashMap<>();
        model.put("username","Ayberk Ersoy");
        model.put("id",173);
        return new ModelAndView("homepage","model",model);
    }

    @RequestMapping("/profile")
    public ModelAndView viewProfile(){
        Map<String,Object> model=new HashMap<String,Object>();
        model.put("title","Mr");
        model.put("firstName","Ayberk");
        model.put("lastName","Ersoy");
        model.put("dateOfBirth", new GregorianCalendar(2006,3,9).getTime());
        model.put("description","a <strong> fantastic </strong> Java programmer.");

        List<String> languages=new ArrayList<>();

        languages.add("Turkish");
//        languages.add("English");
//        languages.add("Yunanca");

        model.put("languages",languages);

        return new ModelAndView("profile","model",model);
    }
}

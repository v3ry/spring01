package com.wildcodeschool.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    String name;
    @GetMapping("/doctor/{id}")
    @ResponseBody
    public String doctor (@PathVariable("id") int doctorId){
        switch (doctorId){
            case 1:
            name = "William Hartnell";
            break;
            case 10:
            name = "David Tennant";
            break;
            case 13:
            name = "Jodie Whittaker";
            break;
            default:
            name = "no Medic Found!";
        }
        return "<h1>Doctor : </h1>" + name;
        // return "<h1>'Doctor '</h1>" + "<h2 th:text='${name}'/>";
    };

    // public String index() {
    //     return "<h1>Doctor </h1><h2>{name}</h2>";
    // }
    
}

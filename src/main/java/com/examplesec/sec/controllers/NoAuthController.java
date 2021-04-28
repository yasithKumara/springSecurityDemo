package com.examplesec.sec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/noAuth")
public class NoAuthController {

    @GetMapping("/getMsg")
    public String greeting(){
        return "No security";
    }




}

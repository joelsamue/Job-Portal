package com.job.portal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.portal.domain.UserRole;



@RestController 
public class HomeController {

    @GetMapping 
    public String HomeController() {
        return "Job Portal System----------" + UserRole.ROLE_JOB_EMPLOYER;

    }
     
}

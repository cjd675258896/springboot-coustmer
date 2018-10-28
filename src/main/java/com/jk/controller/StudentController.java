package com.jk.controller;

import com.jk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public void toCall() {
        studentService.getUserInfo();
    }
}



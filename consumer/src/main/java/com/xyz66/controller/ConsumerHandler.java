package com.xyz66.controller;

import com.xyz66.entity.Student;
import com.xyz66.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StudentService studentService;

    public static String url = "http://localhost:8010/student/findAll";
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
//        return restTemplate.getForObject(url, Collection.class);
        return studentService.findAll();
    }
}

package com.xyz66.controller;

import com.xyz66.entity.Student;
import com.xyz66.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Gjkt
 * @since 2023/12/22 11:11
 */
@RestController
@RequestMapping("/consumer2")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/findById/{id}")// 注意是全路径！！！
    public Student findById(@PathVariable("id") Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        studentService.delete(id);
    }
}

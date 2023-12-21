package com.xyz66.controller;

import com.xyz66.entity.Student;
import com.xyz66.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")// 添加
    public void save(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @PutMapping("/update")// 改
    public void update(@RequestBody Student student){
        studentRepository.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        studentRepository.delete(id);
    }

}

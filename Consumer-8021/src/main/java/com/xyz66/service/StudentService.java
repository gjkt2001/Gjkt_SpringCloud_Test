package com.xyz66.service;

import com.xyz66.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @author Gjkt
 * @since 2023/12/22 11:05
 */
@Service
@FeignClient(name = "provider")// 服务提供者叫啥？
public interface StudentService {

//    @GetMapping("student/findById/{id}")
    @RequestMapping(value = "student/findById/{id}")
    public Student findById(@PathVariable("id") Long id);

    @DeleteMapping(value = "student/delete/{id}")
//    @RequestMapping(value = "student/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id);
}

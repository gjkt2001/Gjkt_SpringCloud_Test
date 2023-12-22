package com.xyz66.service;

import com.xyz66.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author Gjkt
 * @since 2023/12/22 10:29
 */
@Component
@FeignClient(name="provider")//标注使用OpenFeign调用的springcloud-product-provider服务
public interface StudentService {
//    @GetMapping("/student/findAll")
    @RequestMapping(value = "/student/findAll",method = RequestMethod.GET)// 指定请求路径和请求方式
    public Collection<Student> findAll();
}

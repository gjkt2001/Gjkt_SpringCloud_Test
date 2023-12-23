package com.xyz66.feign.impl;

import com.xyz66.entity.Student;
import com.xyz66.feign.FeignProvider;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author Gjkt
 * @since 2023/12/23 19:18
 */
@Component
public class FeginError implements FeignProvider {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中.....";
    }
}

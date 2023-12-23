package com.xyz66.feign;

import com.xyz66.entity.Student;
import com.xyz66.feign.impl.FeginError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author Gjkt
 * @since 2023/12/23 18:58
 */
@FeignClient(name = "provider",fallback = FeginError.class)// 服务提供者名字,服务降级类指定
public interface FeignProvider {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}

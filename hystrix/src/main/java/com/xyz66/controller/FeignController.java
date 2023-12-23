package com.xyz66.controller;

import com.xyz66.feign.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjkt
 * @since 2023/12/23 19:05
 */
@RestController
@RequestMapping("/hystrix")
public class FeignController {
    @Autowired
    private FeignProvider feignProvider;

    @GetMapping("/index")
    public String index(){
        return feignProvider.index();
    }
}

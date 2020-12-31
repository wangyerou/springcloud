package com.it.hystrix.controller;

import com.it.hystrix.entity.Student;
import com.it.hystrix.feignClient.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author WangYerou
 * @Date 2020/12/30 16:26
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}

package com.it.feign.controller;

import com.it.feign.entity.Student;
import com.it.feign.feignClient.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author WangYerou
 * @Date 2020/12/30 15:55
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
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

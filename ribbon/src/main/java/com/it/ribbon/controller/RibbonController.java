package com.it.ribbon.controller;

import com.it.ribbon.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author WangYerou
 * @Date 2020/12/25 17:14
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return restTemplate.getForObject("http://provider/student/findAll", List.class);
    }
}

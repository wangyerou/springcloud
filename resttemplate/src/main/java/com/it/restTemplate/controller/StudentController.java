package com.it.restTemplate.controller;

import com.it.restTemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author WangYerou
 * @Date 2020/12/25 14:51
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll", List.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, null);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }
}

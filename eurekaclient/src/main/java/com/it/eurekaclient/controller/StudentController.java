package com.it.eurekaclient.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.it.eurekaclient.entity.Student;
import com.it.eurekaclient.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author WangYerou
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.list();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return studentService.getById(id);
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody Student student) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", student.getId());
        return studentService.update(student, wrapper);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable("id") long id) {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("id",id);
        return studentService.removeById(id);
    }
}


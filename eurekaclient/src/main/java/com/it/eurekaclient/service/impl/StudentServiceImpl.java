package com.it.eurekaclient.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.eurekaclient.entity.Student;
import com.it.eurekaclient.mapper.StudentMapper;
import com.it.eurekaclient.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author WangYerou
 * @since 2020-12-18
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}

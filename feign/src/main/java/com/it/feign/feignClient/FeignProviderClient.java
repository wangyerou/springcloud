package com.it.feign.feignClient;

import com.it.feign.entity.Student;
import com.it.feign.error.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author WangYerou
 * @Date 2020/12/30 15:53
 */
@FeignClient(value = "provider/student", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("findAll")
    public List<Student> findAll();

    @GetMapping("/index")
    public String index();
}

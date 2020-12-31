package com.it.feign.error;

import com.it.feign.entity.Student;
import com.it.feign.feignClient.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author WangYerou
 * @Date 2020/12/30 15:57
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}

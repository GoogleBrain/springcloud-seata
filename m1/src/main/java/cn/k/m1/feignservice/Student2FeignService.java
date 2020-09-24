package cn.k.m1.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "m2")
public interface Student2FeignService {

    @RequestMapping("/m2")
    public Integer insert(@RequestParam("id") Integer id, @RequestParam("name") String name,@RequestParam("age") Integer age);
}

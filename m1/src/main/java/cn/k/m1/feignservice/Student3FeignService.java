package cn.k.m1.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "m3")
public interface Student3FeignService {

    @RequestMapping("/m3")
    public Integer insert(@RequestParam("id")Integer id,@RequestParam("name") String name,@RequestParam("age") Integer age);
}

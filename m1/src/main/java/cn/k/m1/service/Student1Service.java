package cn.k.m1.service;

import cn.k.m1.dao.Student1Dao;
import cn.k.m1.domain.Student1;
import cn.k.m1.feignservice.Student2FeignService;
import cn.k.m1.feignservice.Student3FeignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Student1Service {

    @Resource
    private Student1Dao student1Dao;

    @Resource
    private Student2FeignService student2FeignService;

    @Resource
    private Student3FeignService student3FeignService;

    public int insert(Student1 student1){
        student1Dao.insert(student1);
        student3FeignService.insert(student1.getId(),student1.getName(),student1.getAge());
        student2FeignService.insert(student1.getId(),student1.getName(),student1.getAge());
        return 1;

    }
}

package cn.k.m1.controller;

import cn.k.m1.domain.Student1;
import cn.k.m1.service.Student1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class Student1Controller {

    @Value("${server.port}")
    private String port;

    @Resource
    public Student1Service student1Service;

    @ResponseBody
    @RequestMapping("/m1")
    public int insert(Integer id, String name, Integer age){
        Student1 student1 = new Student1();
        student1.setId(id);
        student1.setName(name);
        student1.setAge(age);
        log.info("M1收到参数》》》》》id:"+id+",name:"+name+",age:"+age+",port:"+port);
        return student1Service.insert(student1);
    }
}

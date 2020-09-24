package cn.k.m2.controller;

import cn.k.m2.domain.Student2;
import cn.k.m2.service.Student2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class Student2Controller {

    @Value("${server.port}")
    private String port;

    @Resource
    public Student2Service student2Service;

    @ResponseBody
    @RequestMapping("/m2")
    public int insert(Integer id, String name, Integer age) {
        Student2 student1 = new Student2();
        student1.setId(id);
        student1.setName(name);
        student1.setAge(age);
        log.info("M2 收到参数》》》》》id:" + id + ",name:" + name + ",age:" + age + ",port:" + port);
        return student2Service.insert(student1);
    }
}
package cn.k.m3.controller;

import cn.k.m3.domain.Student3;
import cn.k.m3.service.Student3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class Student3Controller {

    @Value("${server.port}")
    private String port;

    @Resource
    public Student3Service student2Service;

    @ResponseBody
    @RequestMapping("/m3")
    public int insert(Integer id, String name, Integer age) {
        Student3 student1 = new Student3();
        student1.setId(id);
        student1.setName(name);
        student1.setAge(age);
        log.info("M3 收到参数》》》》》id:" + id + ",name:" + name + ",age:" + age + ",port:" + port);
        return student2Service.insert(student1);
    }
}
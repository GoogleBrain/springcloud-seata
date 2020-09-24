package cn.k.m3.service;

import cn.k.m3.dao.Student3Dao;
import cn.k.m3.domain.Student3;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Student3Service {

    @Resource
    private Student3Dao student3Dao;

    public int insert(Student3 student3) {
        return student3Dao.insert(student3);
    }
}

package cn.k.m2.service;

import cn.k.m2.dao.Student2Dao;
import cn.k.m2.domain.Student2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Student2Service {

    @Resource
    private Student2Dao student2Dao;

    public int insert(Student2 student2) {
        return student2Dao.insert(student2);
    }
}

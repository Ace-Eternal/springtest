package com.example.springtest;

import com.example.springtest.dao.IStudentDao;
import com.example.springtest.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentDaoTest {
    @Autowired
    //自动装配
    //接口是不能new的，aoto会自动new，实现类在包里面
    private IStudentDao dao;
    @Test
    void insertTest(){
        Student student=new Student();
        student.setAge(10);
        student.setName("sss");
        student.setPassword("123");
        student.setSex(true);
        dao.save(student);
    }
    @Test
    void findTest(){
        List<Student>result= dao.findAll();
        System.out.println(result.size());
    }
    @Test
    void loginTest(){
        Student student=dao.findStudentByNameAndPassword("sss","123");
        if(student!=null){
            System.out.println(student.getName()+"登录成功");
        }
    }
    @Test
    void updateStudentNameById(){
        Integer i=dao.updateStudentNameById("aaa",1L);
    }


}

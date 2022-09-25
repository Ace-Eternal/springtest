package com.example.springtest.dao;

import com.example.springtest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface IStudentDao extends JpaRepository<Student,Long> {
//    JpaRepository  BaseDao
    //已经实现crud
    //2个泛型
    //不用写hql语句 实现登录
    //模板语法
    Student findStudentByNameAndPassword(String name,String password);
    Student findStudentById(Long id);
    @Transactional
    @Modifying
    @Query("update Student s set s.name=?1 where s.id=?2")
    //事务，修改表，没有modifing不能修改
    int updateStudentNameById(String name,Long id);
}

package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.Student;
import org.example.utils.MybatisUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        String sqlId="org.example.dao.StudentDao"+"."+"selectStudents";
        List<Student> studentList=sqlSession.selectList(sqlId);
        for(Student student:studentList){
            System.out.println("学生"+student);
        }
        sqlSession.close();
    }
}

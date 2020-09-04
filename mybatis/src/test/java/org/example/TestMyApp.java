package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyApp {
    public static void main(String[] args) throws IOException {
        String config="mybatis.xml";
        InputStream in= Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        SqlSession sqlSession=factory.openSession();
        String sqlId="org.example.dao.StudentDao"+"."+"insertStudent";
        Student student=new Student();
        student.setId(1004);
        student.setName("刘备");
        student.setEmail("1094432147@qq.com");
        student.setAge(15);
        int num=sqlSession.insert(sqlId,student);
        sqlSession.commit();
        System.out.println("结果="+num);
        sqlSession.close();
    }
}

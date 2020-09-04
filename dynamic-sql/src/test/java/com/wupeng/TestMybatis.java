package com.wupeng;


import com.github.pagehelper.PageHelper;
import com.wupeng.dao.StudentDao;
import com.wupeng.domain.Student;
import com.wupeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMybatis {

    @Test
    public void testSelectStudentIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("张三");
//        student.setAge(10);
        List<Student> students=dao.selectStudentIf(student);
       for(Student stu:students){
           System.out.println("学生="+stu);
       }

    }
    @Test
    public void testSelectStudentWhere() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("张三");
        student.setAge(10);
        List<Student> students=dao.selectStudentWhere(student);
        for(Student stu:students){
            System.out.println("学生="+stu);
        }

    }
    @Test
    public void testSelectStudentForEach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1003);
        List<Student> students=dao.selectStudentForEach(list);
        for(Student stu:students){
            System.out.println("学生="+stu);
        }

    }
    @Test
    public void testSelectAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        PageHelper.startPage(2,2);
        List<Student> students=dao.selectAll();
        for(Student stu:students){
            System.out.println("学生="+stu);
        }

    }
}
